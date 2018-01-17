package com.dly.dao;

import com.dly.entity.TUser;
import com.dly.entity.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TUserMapper
{
  public abstract long countByExample(TUserExample paramTUserExample);

  public abstract int deleteByExample(TUserExample paramTUserExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TUser paramTUser);

  public abstract int insertSelective(TUser paramTUser);

  public abstract List<TUser> selectByExample(TUserExample paramTUserExample);

  public abstract TUser selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TUser paramTUser, @Param("example") TUserExample paramTUserExample);

  public abstract int updateByExample(@Param("record") TUser paramTUser, @Param("example") TUserExample paramTUserExample);

  public abstract int updateByPrimaryKeySelective(TUser paramTUser);

  public abstract int updateByPrimaryKey(TUser paramTUser);
}