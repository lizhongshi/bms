package com.dly.dao;

import com.dly.entity.TImage;
import com.dly.entity.TImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TImageMapper
{
  public abstract long countByExample(TImageExample paramTImageExample);

  public abstract int deleteByExample(TImageExample paramTImageExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TImage paramTImage);

  public abstract int insertSelective(TImage paramTImage);

  public abstract List<TImage> selectByExample(TImageExample paramTImageExample);

  public abstract TImage selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TImage paramTImage, @Param("example") TImageExample paramTImageExample);

  public abstract int updateByExample(@Param("record") TImage paramTImage, @Param("example") TImageExample paramTImageExample);

  public abstract int updateByPrimaryKeySelective(TImage paramTImage);

  public abstract int updateByPrimaryKey(TImage paramTImage);
}