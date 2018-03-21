package com.dly.explain.base;

public class Result {
	private boolean success;
	private Object message;
	private Object data;
	
	public Result(){
		
	}
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	
	}
	public Result(boolean success, String message, Object data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	
	

}
