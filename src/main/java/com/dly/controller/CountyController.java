package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.service.CountyService;
@RestController
@RequestMapping(value="county")
public class CountyController {
	@Resource
	CountyService countyService;
	
	@RequestMapping(value="all")
	public Object o(String userName) {
		
		return countyService.findCountyAll();
	}

}
