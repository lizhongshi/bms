package com.dly.service;

import com.dly.entity.Page;
import com.dly.entity.Result;
import com.dly.entity.TVideo;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public abstract interface VideoService
{
  public abstract List<TVideo> getVideoAll(Page page);

  public abstract Result upload(MultipartFile paramMultipartFile, String paramString);

  public abstract Result deleteVideo(Integer paramInteger, String paramString);
}