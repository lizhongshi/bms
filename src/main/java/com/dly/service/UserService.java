package com.dly.service;

import java.util.List;

import com.dly.entity.Group_m;
import com.dly.entity.Moudle;
import com.dly.entity.User;

public interface UserService {
	public User  findUserByUserName(String userName);
	
	public List<Group_m> test();
	

}
