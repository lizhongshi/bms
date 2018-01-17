package com.dly.dao;

import com.dly.entity.TCarousel;
import com.dly.entity.TCarouselExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TCarouselMapper
{
  public abstract long countByExample(TCarouselExample paramTCarouselExample);

  public abstract int deleteByExample(TCarouselExample paramTCarouselExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TCarousel paramTCarousel);

  public abstract int insertSelective(TCarousel paramTCarousel);

  public abstract List<TCarousel> selectByExample(TCarouselExample paramTCarouselExample);

  public abstract TCarousel selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TCarousel paramTCarousel, @Param("example") TCarouselExample paramTCarouselExample);

  public abstract int updateByExample(@Param("record") TCarousel paramTCarousel, @Param("example") TCarouselExample paramTCarouselExample);

  public abstract int updateByPrimaryKeySelective(TCarousel paramTCarousel);

  public abstract int updateByPrimaryKey(TCarousel paramTCarousel);
}