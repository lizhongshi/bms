package com.dly.service;

import com.dly.entity.Image;
import com.dly.entity.Result;
import com.dly.entity.Video;
import java.util.List;

public abstract interface ImageService
{
  public abstract List<Image> getImageAll();

  public abstract Result deleteImage(Video paramVideo);
}