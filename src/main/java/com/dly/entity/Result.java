package com.dly.entity;

public class Result {
	private boolean success;
	private String message;
	private String errorMsg;
	public Result(boolean success, String message, String errorMsg) {
		super();
		this.success = success;
		this.message = message;
		this.errorMsg = errorMsg;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	

}
