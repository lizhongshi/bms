package com.dly.explain.base;

public enum LoginMessage {
	NOFINDUSER("您没有注册,请进行注册"),
	PASSWORD_ERROR("用户名或密码错误"),
	SUCCESS("登录成功"),
	NOFIND_TYM("体验码无效,请联系管理员");
	private String message;

	private LoginMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
