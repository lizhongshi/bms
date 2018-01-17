package com.dly.service;

import com.dly.entity.Result;
import com.dly.entity.TPush;
import java.util.List;

public abstract interface PushService
{
  public abstract Result push(TPush paramTPush);

  public abstract List<TPush> get();
}