//package com.dly.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//@Entity
//@Table(name="t_admin")
//public class User {
//	@Id
//	@GeneratedValue
//	private Integer id;
//	@Column(length=50)
//	private String userName;
//	@Column(length=50)
//	private String password;
//	@Transient
//	private String roles; // 所拥有的角色
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getRoles() {
//		return roles;
//	}
//	public void setRoles(String roles) {
//		this.roles = roles;
//	}
//	
//}
