package com.dly.entity;

public class TAdmin
{
  private Integer id;
  private String password;
  private String userName;
  private String salt;
  private String newPassword1;
  private String newPassword2;
  
  public String getNewPassword1() {
	return newPassword1;
}

public void setNewPassword1(String newPassword1) {
	this.newPassword1 = newPassword1;
}

public String getNewPassword2() {
	return newPassword2;
}

public void setNewPassword2(String newPassword2) {
	this.newPassword2 = newPassword2;
}

public Integer getId()
  {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = (password == null ? null : password.trim());
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = (userName == null ? null : userName.trim());
  }

  public String getSalt() {
    return this.salt;
  }

  public void setSalt(String salt) {
    this.salt = (salt == null ? null : salt.trim());
  }

  public String toString()
  {
    return "TAdmin [id=" + this.id + ", password=" + this.password + ", userName=" + this.userName + ", salt=" + this.salt + "]";
  }
}