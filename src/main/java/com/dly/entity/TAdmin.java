package com.dly.entity;

public class TAdmin
{
  private Integer id;
  private String password;
  private String userName;
  private String salt;

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