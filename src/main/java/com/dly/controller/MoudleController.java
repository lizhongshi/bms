package com.dly.controller;

import com.dly.entity.TMoudle;
import com.dly.service.MoudleService;
import java.io.PrintStream;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"moudle"})
public class MoudleController
{

  @Resource
  MoudleService moudleService;

  @ResponseBody
  @RequestMapping({"all"})
  public Object getMoudleAll()
  {
    return this.moudleService.findMoudleAll();
  }

  @RequestMapping({"delete"})
  public Object deleteMoudleById(Integer id) {
    return this.moudleService.deleteMoudleById(id);
  }
  @RequestMapping({"edit"})
  public Object editMoudleById(TMoudle moudle) {
    System.out.println("修改moudle参数:" + moudle);

    return this.moudleService.editMoudleById(moudle);
  }
  @RequestMapping({"add"})
  public Object addMoudle(TMoudle moudle) {
    System.out.println("添加模块参数" + moudle);
    return this.moudleService.addMoudle(moudle);
  }
}