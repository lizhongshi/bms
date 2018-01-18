package com.dly.service;

import java.util.List;

import com.dly.entity.Image;
import com.dly.entity.Page;
import com.dly.entity.Result;
import com.dly.entity.Video;

public abstract interface ImageService
{
  public abstract List<Image> getImageAll(Page page);

  public abstract Result deleteImage(Video paramVideo);
}