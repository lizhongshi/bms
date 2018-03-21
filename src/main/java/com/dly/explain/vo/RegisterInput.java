package com.dly.explain.vo;


public class RegisterInput {
	

	    private String phone;

	    private String nickName;

	    private String password;
	   
	    private String verificationCode;//验证码
	    
	    private String language;//语言
	    private String area;//地区
	    
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

	
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		

	

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getVerificationCode() {
			return verificationCode;
		}

		public void setVerificationCode(String verificationCode) {
			this.verificationCode = verificationCode;
		}
	    
	    
}
