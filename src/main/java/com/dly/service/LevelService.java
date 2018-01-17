package com.dly.service;

import com.dly.entity.Level_m;
import java.util.List;

public abstract interface LevelService
{
  public abstract List<Level_m> getLevelAll();
}