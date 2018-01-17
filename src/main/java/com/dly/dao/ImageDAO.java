package com.dly.dao;

import com.dly.entity.Image;
import java.util.List;

public abstract interface ImageDAO
{
  public abstract List<Image> getImageAll();
}