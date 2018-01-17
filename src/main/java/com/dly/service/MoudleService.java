package com.dly.service;

import com.dly.entity.Result;
import com.dly.entity.TMoudle;
import java.util.List;

public abstract interface MoudleService
{
  public abstract List<TMoudle> findMoudleAll();

  public abstract Result deleteMoudleById(Integer paramInteger);

  public abstract Result editMoudleById(TMoudle paramTMoudle);

  public abstract Result addMoudle(TMoudle paramTMoudle);
}