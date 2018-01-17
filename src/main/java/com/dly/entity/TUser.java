package com.dly.entity;

import java.util.Date;

public class TUser
{
  private Integer userId;
  private String username;
  private String password;
  private String nickname;
  private String salt;
  private String tokenid;
  private String phone;
  private String weixin;
  private String qq;
  private String struts;
  private String email;
  private String iconUrl;
  private Date creationTime;
  private Date birthDate;
  private String sex;
  private Integer id;
  private String remarks;
  private String trueName;
  private String userName;

  public Integer getUserId()
  {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = (username == null ? null : username.trim());
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = (password == null ? null : password.trim());
  }

  public String getNickname() {
    return this.nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = (nickname == null ? null : nickname.trim());
  }

  public String getSalt() {
    return this.salt;
  }

  public void setSalt(String salt) {
    this.salt = (salt == null ? null : salt.trim());
  }

  public String getTokenid() {
    return this.tokenid;
  }

  public void setTokenid(String tokenid) {
    this.tokenid = (tokenid == null ? null : tokenid.trim());
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = (phone == null ? null : phone.trim());
  }

  public String getWeixin() {
    return this.weixin;
  }

  public void setWeixin(String weixin) {
    this.weixin = (weixin == null ? null : weixin.trim());
  }

  public String getQq() {
    return this.qq;
  }

  public void setQq(String qq) {
    this.qq = (qq == null ? null : qq.trim());
  }

  public String getStruts() {
    return this.struts;
  }

  public void setStruts(String struts) {
    this.struts = (struts == null ? null : struts.trim());
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = (email == null ? null : email.trim());
  }

  public String getIconUrl() {
    return this.iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = (iconUrl == null ? null : iconUrl.trim());
  }

  public Date getCreationTime() {
    return this.creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public Date getBirthDate() {
    return this.birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getSex() {
    return this.sex;
  }

  public void setSex(String sex) {
    this.sex = (sex == null ? null : sex.trim());
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRemarks() {
    return this.remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = (remarks == null ? null : remarks.trim());
  }

  public String getTrueName() {
    return this.trueName;
  }

  public void setTrueName(String trueName) {
    this.trueName = (trueName == null ? null : trueName.trim());
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = (userName == null ? null : userName.trim());
  }
}