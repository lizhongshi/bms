package com.dly.dao;

import com.dly.entity.TAdmin;
import com.dly.entity.TAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TAdminMapper
{
  public abstract long countByExample(TAdminExample paramTAdminExample);

  public abstract int deleteByExample(TAdminExample paramTAdminExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TAdmin paramTAdmin);

  public abstract int insertSelective(TAdmin paramTAdmin);

  public abstract List<TAdmin> selectByExample(TAdminExample paramTAdminExample);

  public abstract TAdmin selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TAdmin paramTAdmin, @Param("example") TAdminExample paramTAdminExample);

  public abstract int updateByExample(@Param("record") TAdmin paramTAdmin, @Param("example") TAdminExample paramTAdminExample);

  public abstract int updateByPrimaryKeySelective(TAdmin paramTAdmin);

  public abstract int updateByPrimaryKey(TAdmin paramTAdmin);
}