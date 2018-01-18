package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dly.entity.ChangePassword;
import com.dly.entity.TAdmin;
import com.dly.service.UserService;

@Controller
@RequestMapping({"personal"})
public class UserController
{

  @Resource
  UserService userService;

  @PostMapping(value={"login"}, produces={"application/json;charset=UTF-8"})
  @ResponseBody
  public Object login(@RequestBody TAdmin user)
  {
    System.out.println("登录参数----->" + user);
    return this.userService.login(user);
  }
  @PostMapping(value={"register"}, produces={"application/json;charset=UTF-8"})
  @ResponseBody
  public Object register(@RequestBody TAdmin user) { return this.userService.register(user); }
  @PostMapping(value={"change"}, produces={"application/json;charset=UTF-8"})
  @ResponseBody
  public Object changePassword( TAdmin admin) {
	  return userService.changePasswords(admin);
  }

}