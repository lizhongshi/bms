package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dly.dao.TAdminMapper;
import com.dly.entity.Result;
import com.dly.entity.TAdmin;
import com.dly.entity.TAdminExample;
import com.dly.entity.TAdminExample.Criteria;
import com.dly.service.UserService;
import com.dly.util.Util;
@Service("userService")
@Transactional
public class UserServiceImpl  implements UserService{
	@Resource
	TAdminMapper tAdminMapper;
	@Override
	public Result login(TAdmin user) {
		TAdminExample example =new TAdminExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserNameEqualTo(user.getUserName());
		List<TAdmin>result= tAdminMapper.selectByExample(example);
		if(result.size()>0) {
			TAdmin admin=result.get(0);
			UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(), Util.Md5(user.getPassword(),admin.getSalt() ));//传入密码
			Subject subject=SecurityUtils.getSubject();
			try {
				subject.login(token);//登录
				return new Result(true,"登录成功","");
			}catch(Exception e) {
				e.printStackTrace();
				return new Result(false,"用户名或密码错误","");
			}
		}
		return new Result(false,"用户名或密码错误","");
	
	}
	@Override
	public Result register(TAdmin user) {
		String salt=Util.getUUID();
		String pass=Util.Md5(user.getPassword(), salt);
		TAdminExample example =new TAdminExample();
		Criteria criteria=example.createCriteria();
		criteria.andUserNameEqualTo(user.getUserName());
		List<TAdmin>result= tAdminMapper.selectByExample(example);
		if(result.size()>0) {
			 return new Result(false,"账户已存在","");
		}
		user.setPassword(pass);
		user.setSalt(salt);
		if(tAdminMapper.insert(user)>0) {
			 return new Result(true,"注册成功","");
		}
		 return new Result(false,"注册失败","");
	}


}
