package com.dly.dao;

import com.dly.entity.Level_m;
import java.util.List;

public abstract interface LevelDAO
{
  public abstract List<Level_m> getLevelAll();
}