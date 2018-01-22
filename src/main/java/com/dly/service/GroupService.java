package com.dly.service;

import java.util.List;

import com.dly.entity.Level;
import com.dly.entity.Page;
import com.dly.entity.PageResult;
import com.dly.entity.Result;
import com.dly.entity.TGroup;

public abstract interface GroupService
{
  public abstract List<TGroup> findGroupAll(Page page);

  public abstract int insertGroup(TGroup paramTGroup);

  public abstract PageResult findGroupByMoudleId(TGroup paramTGroup,int page,int rows);

  public abstract Result deleteGroup(Integer paramInteger);

  public abstract List<Level> getLevel();

  public abstract int editGroupById(TGroup paramTGroup);
}