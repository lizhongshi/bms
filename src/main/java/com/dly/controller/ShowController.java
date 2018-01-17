package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.service.ShowService;

@RestController
@RequestMapping("show")
public class ShowController {
	@Resource
	ShowService showService;
	@RequestMapping("show")
	public Object show() {
		return showService.show();
	}

}
