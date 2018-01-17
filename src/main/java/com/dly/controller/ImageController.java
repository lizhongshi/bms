package com.dly.controller;

import com.dly.entity.Video;
import com.dly.service.ImageService;
import java.io.PrintStream;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"image"})
public class ImageController
{

  @Resource
  ImageService ImageService;

  @RequestMapping({"all"})
  public Object getImageAll()
  {
    return this.ImageService.getImageAll();
  }
  @DeleteMapping
  public Object delete(@RequestBody Video video) {
    System.out.println("deleteImage--->" + video);
    return this.ImageService.deleteImage(video);
  }
}