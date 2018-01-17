package com.dly.dao;

import com.dly.entity.TMoudle;
import com.dly.entity.TMoudleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TMoudleMapper
{
  public abstract long countByExample(TMoudleExample paramTMoudleExample);

  public abstract int deleteByExample(TMoudleExample paramTMoudleExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TMoudle paramTMoudle);

  public abstract int insertSelective(TMoudle paramTMoudle);

  public abstract List<TMoudle> selectByExample(TMoudleExample paramTMoudleExample);

  public abstract TMoudle selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TMoudle paramTMoudle, @Param("example") TMoudleExample paramTMoudleExample);

  public abstract int updateByExample(@Param("record") TMoudle paramTMoudle, @Param("example") TMoudleExample paramTMoudleExample);

  public abstract int updateByPrimaryKeySelective(TMoudle paramTMoudle);

  public abstract int updateByPrimaryKey(TMoudle paramTMoudle);
}