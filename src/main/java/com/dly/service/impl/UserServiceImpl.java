package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.Repository.UserRepository;
import com.dly.dao.GroupDAO;
import com.dly.entity.Moudle;
import com.dly.entity.User;
import com.dly.service.UserService;
@Service("userService")
public class UserServiceImpl  implements UserService{
	@Resource
	UserRepository userRepository;
	@Resource
	GroupDAO userDAO;
	@Override
	public User findUserByUserName(String userName) {
		
		return userRepository.findUserByUserName(userName);
	}
	
	public User test() {
	return 	userDAO.test();
	}

}
