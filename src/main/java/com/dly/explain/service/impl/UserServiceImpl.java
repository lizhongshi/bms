package com.dly.explain.service.impl;




import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dly.explain.base.ChangeUserInfoMessage;
import com.dly.explain.base.LoginMessage;
import com.dly.explain.base.RegisterMessage;
import com.dly.explain.base.Result;
import com.dly.explain.dao.TUserMapper;
import com.dly.explain.entity.TAdmin;
import com.dly.explain.entity.TUser;
import com.dly.explain.entity.TUserExample;
import com.dly.explain.entity.TUserExample.Criteria;
import com.dly.explain.service.AdminService;
import com.dly.explain.service.ExperienceService;
import com.dly.explain.service.UserService;
import com.dly.explain.util.JwtUtils;
import com.dly.explain.util.RedisCacheUtil;
import com.dly.explain.util.Util;
import com.dly.explain.vo.ChangeUserInfoInput;
import com.dly.explain.vo.LoginInput;
import com.dly.explain.vo.RegisterInput;
import com.dly.explain.vo.UploadIconInput;
import com.dly.explain.vo.UserInfo;

@Service("userService")
@Transactional
public class UserServiceImpl  implements UserService {
	
	
	private static Logger log = Logger.getLogger(UserServiceImpl.class);
	
	@Resource
	TUserMapper tUserMapper;
	
	
	@Resource
	RedisCacheUtil redisCacheUtil;
	
	@Override
	public Result login(LoginInput user) {
		switch (user.getType()) {
			case "pwd":{//密码登录
				TUserExample TUserExample =new TUserExample();
				Criteria createCriteria = TUserExample.createCriteria();
				//-----> 条件
				createCriteria.andPhoneEqualTo(user.getPhone());
						//<----
				List<TUser> daoResult= tUserMapper.selectByExample(TUserExample);
				if(daoResult.size()>0) {
					TUser userOut=	daoResult.get(0);
					 String password=	userOut.getPassword();
					 String salt=userOut.getSalt();
					 if(Util.Md5(user.getPassword(), salt).equals(password)) {//登录
						String token=  JwtUtils.createJWT(String.valueOf(userOut.getUserId()));
						JSONObject result=new JSONObject();
						result.put("jwt", token);
						result.put("userId", userOut.getUserId());
						 return new Result(true,LoginMessage.SUCCESS.getMessage(),result);
					 }else {
						 return new Result(false,LoginMessage.PASSWORD_ERROR.getMessage());
					 }
				}else {
					return new Result(false,LoginMessage.NOFINDUSER.getMessage());
				}
			}
			case "tym":{//体验码登录
				if(redisCacheUtil.exists(ExperienceService.KEY+user.getExperience())) {
					JSONObject result=new JSONObject();
					String token=  JwtUtils.createJWT(user.getExperience());
					result.put("jwt", token);
					result.put("userId", user.getExperience());
					 return new Result(true,LoginMessage.SUCCESS.getMessage(),result);
				}else {
					return new Result(false,LoginMessage.NOFIND_TYM.getMessage());
				}
			}
		}
		return new Result(false,"方法无效");
	}

	@Override
	public  Result  register(RegisterInput input) {
		
		if(!redisCacheUtil.getValue(input.getPhone()).equals(input.getVerificationCode())) { //验证短信
			return new Result(false,RegisterMessage.VERIFICATION_CODE.getMessage());
		}
		synchronized(this) {
			TUserExample tUserExample=new TUserExample();
			tUserExample.createCriteria().andPhoneEqualTo(input.getPhone());
			List<TUser> selectByExample = tUserMapper.selectByExample(tUserExample);
			if(selectByExample.size()<1) {
				TUser user=new TUser();
				String salt=Util.getUUID();
				user.setSalt(salt);
				user.setPassword(Util.Md5(input.getPassword(), salt));
				user.setIsVip(false);
				user.setLanguage(input.getLanguage());
				user.setArea(input.getArea());
				user.setPhone(input.getPhone());
				int insert = tUserMapper.insert(user);
				if(insert>0) {
					return new Result(true,RegisterMessage.SUCCESS.getMessage());
				}
			}else {
				return new Result(false,RegisterMessage.USER_REPEAT.getMessage());
			}
		}
		
		return new Result(false,RegisterMessage.ERROR.getMessage());
	}

	@Override
	public Result logout(String tokenid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result changeUserInfo(ChangeUserInfoInput input) {
		TUser user= tUserMapper.selectByPrimaryKey(input.getUserId());
		if(user!=null) {
			switch (input.getFfbm()) {
				case "1":{                                 //修改手机号
					if(input.getYzm().equals(redisCacheUtil.getValue(input.getNewPhone()))) {//验证手机验证码
//						TUserExample tUserExample = new TUserExample();
//						tUserExample.createCriteria().and
						user.setPhone(input.getNewPhone());
						int i=tUserMapper.updateByPrimaryKey(user);
						if(i>0) {
							
							return new Result(true,ChangeUserInfoMessage.PHONE_SUCCESS.getMessage());
						}else {
							return new Result(false,ChangeUserInfoMessage.PHONE_ERROR.getMessage());
						}
					}else {
						return new Result(false,ChangeUserInfoMessage.PHONE_YZM_ERROR.getMessage());
					}
				}
				
				case "2":{                              //修改密码
					String salt=user.getSalt();
					if(user.getPassword().equals(Util.Md5(input.getOldPassword(), salt))&&input.getNewPassword()!=null) {//验证密码
						user.setPassword(Util.Md5(input.getNewPassword(), salt));
						int i=tUserMapper.updateByPrimaryKey(user);
						if(i>0) {
							return new Result(true,ChangeUserInfoMessage.PASSWORD_SUCCESS.getMessage());
						}else {
							return new Result(false,ChangeUserInfoMessage.PASSWORD_ERROR.getMessage());
						}
					}else {
						return new Result(false,ChangeUserInfoMessage.OLD_PASSWORD_ERROR.getMessage());
					}
				}
				
			}
		}
		return new Result(false,"方法无效");
	}

	@Override
	public Result resetPassword(ChangeUserInfoInput input) {
		
		TUserExample tUserExample = new  TUserExample();
		tUserExample.createCriteria().andPhoneEqualTo(input.getPhone());
		List<TUser> result= tUserMapper.selectByExample(tUserExample);
		if(result.size()==1) {
			if(input.getYzm().equals(redisCacheUtil.getValue(input.getPhone()))) {//验证手机验证码
				String salt=Util.getUUID();
				result.get(0).setPassword(Util.Md5(input.getNewPassword(), salt));
				result.get(0).setSalt(salt);
				int i=tUserMapper.updateByPrimaryKey(result.get(0));
				if(i>0) {
					return new Result(true,ChangeUserInfoMessage.RESET_PASSWORD_SUCCESS.getMessage());
				}else {
					return new Result(false,ChangeUserInfoMessage.RESET_PASSWORD_ERROR.getMessage());
				}
			}else {
				return new Result(false,ChangeUserInfoMessage.PHONE_YZM_ERROR.getMessage());
			}
		}
		return new Result(false,ChangeUserInfoMessage.RESET_PASSWORD_ERROR.getMessage());
	}

	@Override
	public Result getUserInfo(UserInfo input) {
		UserInfo userInfo = tUserMapper.getUserInfo(input);
		return new Result(true,"",userInfo);
	}

	
	@Override
	public Object uploadUserIcon(UploadIconInput input) {
		TUser user=new TUser();
		user.setIcon(input.getIcon());
		user.setUserId(input.getUserId());
		int updateByExampleSelective = tUserMapper.updateByPrimaryKeySelective(user);
		if(updateByExampleSelective>0) {
			return new Result(true,"上传成功");
		}else {
			return new Result(false,"上传失败");
		}
	}

	@Override
	public Result getUsers() {
		 List<TUser> selectByExample = tUserMapper.selectByExample(null);
		return new Result(true,"",selectByExample);
	}




}
