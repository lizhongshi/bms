package com.dly.controller;

import com.dly.entity.Result;
import com.dly.entity.Video;
import com.dly.service.VideoService;
import java.io.PrintStream;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping({"video"})
public class VideoController
{

  @Resource
  VideoService videoService;

  @RequestMapping({"all"})
  public Object getVideoAll()
  {
    return this.videoService.getVideoAll();
  }
  @PostMapping(value={"upload"}, produces={"application/json;charset=UTF-8"})
  public Object uploadVideo(@RequestParam("file") MultipartFile file, String title) {
    if ((title == null) || ("".equals(title))) {
      return new Result(false, "标题不能为空", "");
    }
    return this.videoService.upload(file, title);
  }

  @DeleteMapping(value={"delete"}, produces={"application/json;charset=UTF-8"})
  public Object deleteVideo(@RequestBody Video video)
  {
    System.out.println("参数:" + video);
    return this.videoService.deleteVideo(video.getId(), video.getPath());
  }
}