package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dly.entity.Moudle_m;
import com.dly.service.MoudleService;
@RestController
@RequestMapping(value="moudle")
public class MoudleController {
	@Resource
	MoudleService moudleService;
	@ResponseBody
	@RequestMapping(value="all")
	public Object getMoudleAll() {
		return moudleService.findMoudleAll();
	}
	@RequestMapping(value="delete")
	public Object deleteMoudleById(Integer id) {
		
		return moudleService.deleteMoudleById(id);
	}
	@RequestMapping(value="edit")
	public Object editMoudleById(Moudle_m moudle) {
		
		return moudleService.editMoudleById(moudle);
	}
	@RequestMapping(value="add")
	public Object addMoudle(Moudle_m moudle) {
		System.out.println("添加模块参数"+moudle);
		return moudleService.addMoudle(moudle);
		
	}
	

}
