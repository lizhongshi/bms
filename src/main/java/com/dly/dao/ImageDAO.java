package com.dly.dao;

import java.util.List;

import com.dly.entity.Image;
import com.dly.entity.Page;

public abstract interface ImageDAO
{
  public abstract List<Image> getImageAll(Page page);
  public int addImage(Image image);
}