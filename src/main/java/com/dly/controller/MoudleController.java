package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dly.service.MoudleService;
@Controller
@RequestMapping(value="moudle")
public class MoudleController {
	@Resource
	MoudleService moudleService;
	@ResponseBody
	@RequestMapping(value="all")
	public Object o(String userName) {
		
		return moudleService.findMoudleAll();
	}

}
