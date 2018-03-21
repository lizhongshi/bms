package com.dly.explain.service;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TAdmin;

public abstract interface AdminService
{
  public abstract Result login(TAdmin paramTAdmin);

  public abstract Result register(TAdmin paramTAdmin);
  public Result changePasswords(TAdmin admin);
  public Object logout( TAdmin admin) ;
}