package com.dly.explain.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dly.explain.entity.TAdmin;
import com.dly.explain.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Resource
	  AdminService adminService;

	  @PostMapping(value={"login"}, produces={"application/json;charset=UTF-8"})
	
	  public Object login(@RequestBody TAdmin user)
	  {
	    System.out.println("登录参数----->" + user);
	    return this.adminService.login(user);
	  }
	  @PostMapping(value={"register"}, produces={"application/json;charset=UTF-8"})
	
	  public Object register(@RequestBody TAdmin user) { return this.adminService.register(user); }
	  @PostMapping(value={"change"}, produces={"application/json;charset=UTF-8"})

	  public Object changePassword( TAdmin admin) {
		  return adminService.changePasswords(admin);
	  }
	  @GetMapping(value={"logout"}, produces={"application/json;charset=UTF-8"})

	  public Object logout( TAdmin admin) {
		  return adminService.logout(admin);
	  }

}
