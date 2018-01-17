package com.dly.dao;

import com.dly.entity.TPush;
import com.dly.entity.TPushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TPushMapper
{
  public abstract long countByExample(TPushExample paramTPushExample);

  public abstract int deleteByExample(TPushExample paramTPushExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TPush paramTPush);

  public abstract int insertSelective(TPush paramTPush);

  public abstract List<TPush> selectByExample(TPushExample paramTPushExample);

  public abstract TPush selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TPush paramTPush, @Param("example") TPushExample paramTPushExample);

  public abstract int updateByExample(@Param("record") TPush paramTPush, @Param("example") TPushExample paramTPushExample);

  public abstract int updateByPrimaryKeySelective(TPush paramTPush);

  public abstract int updateByPrimaryKey(TPush paramTPush);
}