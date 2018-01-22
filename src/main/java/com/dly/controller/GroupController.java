package com.dly.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.dly.entity.Page;
import com.dly.entity.TGroup;
import com.dly.service.GroupService;

@RestController
@RequestMapping({"group"})
public class GroupController
{

  @Resource
  GroupService groupService;

  @RequestMapping({"all"})
  public Object o(Page page)
  {
    return this.groupService.findGroupAll( page);
  }
  @RequestMapping({"save"})
  public int insertGroup(TGroup group) {
    System.out.println("参数--->" + group);
    return this.groupService.insertGroup(group);
  }
  @RequestMapping({"edit"})
  public int editGroupById(TGroup group) {
    System.out.println(group);
   if( group.getIstp().equals("是")){
	   group.setIstp("1");
    } if( group.getIstp().equals("否")){
 	   group.setIstp("0");
     }
    return this.groupService.editGroupById(group);
  }

  @RequestMapping({"groups"})
  public Object findGroupByMoudleId(TGroup group,int page,int rows)
  {
    System.out.println("参数" + group);
    System.out.println("page:  "+page+"rows:  "+rows);
    String json = JSONObject.toJSONString(this.groupService.findGroupByMoudleId(group,page,rows));
    System.out.println("------->" + json);
    return json;
  }

  @RequestMapping({"delete"})
  public Object deleteGroup(Integer id) {
    return this.groupService.deleteGroup(id);
  }
}