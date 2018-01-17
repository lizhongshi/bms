package com.dly.controller;

import com.alibaba.fastjson.JSONObject;
import com.dly.entity.TPush;
import com.dly.service.PushService;
import java.io.PrintStream;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"push"})
public class PushController
{

  @Resource
  PushService pushService;

  @PostMapping
  public Object push(TPush t)
  {
    System.out.println("推送参数---->" + t);
    return this.pushService.push(t);
  }
  @GetMapping
  public Object get() {
    String json = JSONObject.toJSONString(this.pushService.get());
    return json;
  }
}