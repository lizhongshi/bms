package com.dly.service;

import com.dly.entity.Level;
import com.dly.entity.Result;
import com.dly.entity.TGroup;
import java.util.List;

public abstract interface GroupService
{
  public abstract List<TGroup> findGroupAll();

  public abstract int insertGroup(TGroup paramTGroup);

  public abstract List<TGroup> findGroupByMoudleId(TGroup paramTGroup);

  public abstract Result deleteGroup(Integer paramInteger);

  public abstract List<Level> getLevel();

  public abstract int editGroupById(TGroup paramTGroup);
}