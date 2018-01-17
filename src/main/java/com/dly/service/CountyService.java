package com.dly.service;

import com.dly.entity.County_m;
import java.util.List;

public abstract interface CountyService
{
  public abstract List<County_m> findCountyAll();
}