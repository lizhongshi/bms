package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.dly.entity.Group;
import com.dly.service.GroupService;

@RestController
@RequestMapping(value="group")
public class GroupController {
	@Resource
	GroupService groupService;
	
	@RequestMapping(value="all")
	public Object o(String userName) {
		
		return groupService.findGroupAll();
	}
	@RequestMapping(value="save")
	public int insertGroup(Group group) {
		System.out.println(group);
		return groupService.insertGroup( group);
	}
	
	
	
	@RequestMapping(value="groups")
	public Object findGroupByMoudleId(Integer  moudleId,Integer countyId,Integer levelId) {
		String json=JSONObject.toJSONString( groupService.findGroupByMoudleId(moudleId, countyId,levelId));
		System.out.println("------->"+json);
		return  json;
	}
	
	@RequestMapping(value="delete")
	public Object deleteGroup(Integer id) {
		return groupService.deleteGroup(id);
	}
	
	
}
