package com.dly.dao;

import com.dly.entity.County_m;
import java.util.List;

public abstract interface CountyDAO
{
  public abstract List<County_m> getCountyAll();
}