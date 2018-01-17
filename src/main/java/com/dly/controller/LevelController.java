package com.dly.controller;

import com.dly.service.LevelService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"level"})
public class LevelController
{

  @Resource
  LevelService levelService;

  @PostMapping({"levels"})
  public Object level()
  {
    return this.levelService.getLevelAll();
  }
}