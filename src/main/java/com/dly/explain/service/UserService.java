package com.dly.explain.service;

import com.dly.explain.base.Result;
import com.dly.explain.vo.ChangeUserInfoInput;
import com.dly.explain.vo.LoginInput;
import com.dly.explain.vo.RegisterInput;
import com.dly.explain.vo.UploadIconInput;
import com.dly.explain.vo.UserInfo;




public interface UserService  {
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public Result login(LoginInput user);//登录
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public Result register(RegisterInput user);//注册
	/**
	 * 获取用户角色
	 * @param userName
	 * @return
	 */
	/**
	 * 退出登录
	 * @param tokenid
	 * @return
	 */
	public Result logout(String tokenid);
	/**
	 * 修改用户信息
	 * @param userName
	 * @return
	 */
	
	public Result changeUserInfo(ChangeUserInfoInput input);
	/**
	 * 插入一条评论
	 * @param in
	 * @return
	 */
	/**
	 * 忘记密码
	 * @param user
	 * @return
	 */
	public  Result resetPassword(ChangeUserInfoInput user);

	/*
	 * 获取用户信息
	 */
	public Result getUserInfo(UserInfo user);

	
	public Object  uploadUserIcon(UploadIconInput input);
	
	public Result getUsers();
}
