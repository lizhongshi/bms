package com.dly.controller;

import com.alibaba.fastjson.JSONObject;
import com.dly.entity.TGroup;
import com.dly.service.GroupService;
import java.io.PrintStream;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"group"})
public class GroupController
{

  @Resource
  GroupService groupService;

  @RequestMapping({"all"})
  public Object o(String userName)
  {
    return this.groupService.findGroupAll();
  }
  @RequestMapping({"save"})
  public int insertGroup(TGroup group) {
    System.out.println("参数--->" + group);
    return this.groupService.insertGroup(group);
  }
  @RequestMapping({"edit"})
  public int editGroupById(TGroup group) {
    System.out.println(group);
    return this.groupService.editGroupById(group);
  }

  @RequestMapping({"groups"})
  public Object findGroupByMoudleId(TGroup group)
  {
    System.out.println("参数" + group);
    String json = JSONObject.toJSONString(this.groupService.findGroupByMoudleId(group));
    System.out.println("------->" + json);
    return json;
  }

  @RequestMapping({"delete"})
  public Object deleteGroup(Integer id) {
    return this.groupService.deleteGroup(id);
  }
}