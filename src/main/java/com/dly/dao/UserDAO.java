package com.dly.dao;

import org.apache.ibatis.annotations.Mapper;

import com.dly.entity.User;

@Mapper
public interface UserDAO {
	public User test();

}
