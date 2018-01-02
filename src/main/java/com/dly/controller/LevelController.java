package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.service.LevelService;
@RestController
@RequestMapping(value="level")
public class LevelController {
	@Resource
	LevelService levelService;
	@PostMapping("levels")
	public Object level() {
		return levelService.getLevelAll();
	}

}
