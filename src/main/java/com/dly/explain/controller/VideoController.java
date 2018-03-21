package com.dly.explain.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TVideo;
import com.dly.explain.service.VideoService;
import com.dly.explain.vo.Page;



@RestController
@RequestMapping({"/api/video"})
public class VideoController
{

  @Resource
  VideoService videoService;

  @RequestMapping({"all"})
  public Object getVideoAll(Page page, HttpServletRequest request)
  {
	  System.out.println("分页"+page);
    return this.videoService.getVideoAll(page);
  }
  @PostMapping(value={"upload"}, produces={"application/json;charset=UTF-8"})
  public Object uploadVideo(@RequestParam("file") MultipartFile file, String title, HttpServletRequest request) {
    if ((title == null) || ("".equals(title))) {
      return new Result(false, "标题不能为空", "");
    }
    return this.videoService.upload(file, title,request);
  }

  @DeleteMapping(value={""}, produces={"application/json;charset=UTF-8"})
  public Object deleteVideo(@RequestBody TVideo t, HttpServletRequest request)
  {
    //System.out.println("参数:" + video);
	
    return this.videoService.deleteVideo(Integer.valueOf(t.getId()), t.getUrl(),request);
  }
}