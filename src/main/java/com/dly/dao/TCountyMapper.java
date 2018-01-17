package com.dly.dao;

import com.dly.entity.TCounty;
import com.dly.entity.TCountyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TCountyMapper
{
  public abstract long countByExample(TCountyExample paramTCountyExample);

  public abstract int deleteByExample(TCountyExample paramTCountyExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TCounty paramTCounty);

  public abstract int insertSelective(TCounty paramTCounty);

  public abstract List<TCounty> selectByExample(TCountyExample paramTCountyExample);

  public abstract TCounty selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TCounty paramTCounty, @Param("example") TCountyExample paramTCountyExample);

  public abstract int updateByExample(@Param("record") TCounty paramTCounty, @Param("example") TCountyExample paramTCountyExample);

  public abstract int updateByPrimaryKeySelective(TCounty paramTCounty);

  public abstract int updateByPrimaryKey(TCounty paramTCounty);
}