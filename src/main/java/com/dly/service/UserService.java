package com.dly.service;

import com.dly.entity.ChangePassword;
import com.dly.entity.Result;
import com.dly.entity.TAdmin;

public abstract interface UserService
{
  public abstract Result login(TAdmin paramTAdmin);

  public abstract Result register(TAdmin paramTAdmin);
  public Result changePasswords(TAdmin admin);
}