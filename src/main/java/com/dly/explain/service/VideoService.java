package com.dly.explain.service;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TVideo;
import com.dly.explain.vo.Page;

public abstract interface VideoService
{
  public abstract List<TVideo> getVideoAll(Page page);

  public abstract Result upload(MultipartFile paramMultipartFile, String paramString, HttpServletRequest request);

  public abstract Result deleteVideo(Integer paramInteger, String paramString,HttpServletRequest req);
}