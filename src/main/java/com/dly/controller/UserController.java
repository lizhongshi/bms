package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dly.entity.User;
import com.dly.service.UserService;
@Controller
@RequestMapping(value="test")
public class UserController {
	@Resource
	UserService userService;
	@ResponseBody
	@RequestMapping(value="test")
	public Object o(String userName) {
		
		return userService.findUserByUserName(userName);
	}
	@GetMapping("user")
	@ResponseBody
	public  User test() {
	return 	userService.test();
	}

}
