package com.dly.dao;

import com.dly.entity.Moudle_m;
import java.util.List;

public abstract interface MoudleDAO
{
  public abstract List<Moudle_m> getMoudleAll();

  public abstract int deleteMoudleById(Integer paramInteger);

  public abstract int editMoudleById(Moudle_m paramMoudle_m);

  public abstract int addMoudle(Moudle_m paramMoudle_m);
}