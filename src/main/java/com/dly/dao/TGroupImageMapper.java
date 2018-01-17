package com.dly.dao;

import com.dly.entity.TGroupImage;
import com.dly.entity.TGroupImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TGroupImageMapper
{
  public abstract long countByExample(TGroupImageExample paramTGroupImageExample);

  public abstract int deleteByExample(TGroupImageExample paramTGroupImageExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(@Param("images") List<TGroupImage> paramList);

  public abstract int insertSelective(TGroupImage paramTGroupImage);

  public abstract List<TGroupImage> selectByExample(TGroupImageExample paramTGroupImageExample);

  public abstract TGroupImage selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TGroupImage paramTGroupImage, @Param("example") TGroupImageExample paramTGroupImageExample);

  public abstract int updateByExample(@Param("record") TGroupImage paramTGroupImage, @Param("example") TGroupImageExample paramTGroupImageExample);

  public abstract int updateByPrimaryKeySelective(TGroupImage paramTGroupImage);

  public abstract int updateByPrimaryKey(TGroupImage paramTGroupImage);
}