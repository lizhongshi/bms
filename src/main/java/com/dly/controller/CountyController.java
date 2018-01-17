package com.dly.controller;

import com.dly.service.CountyService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"county"})
public class CountyController
{

  @Resource
  CountyService countyService;

  @RequestMapping({"all"})
  public Object o(String userName)
  {
    return this.countyService.findCountyAll();
  }
}