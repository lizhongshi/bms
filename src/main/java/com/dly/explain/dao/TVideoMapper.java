package com.dly.explain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;

import com.dly.explain.entity.TVideo;
import com.dly.explain.entity.TVideoExample;



public abstract interface TVideoMapper
{
  public abstract long countByExample(TVideoExample paramTVideoExample);

  public abstract int deleteByExample(TVideoExample paramTVideoExample);

  public abstract int deleteByPrimaryKey(Integer paramInteger);

  public abstract int insert(TVideo paramTVideo);

  public abstract int insertSelective(TVideo paramTVideo);

  public abstract List<TVideo> selectByExample(TVideoExample paramTVideoExample);

  public abstract TVideo selectByPrimaryKey(Integer paramInteger);

  public abstract int updateByExampleSelective(@Param("record") TVideo paramTVideo, @Param("example") TVideoExample paramTVideoExample);

  public abstract int updateByExample(@Param("record") TVideo paramTVideo, @Param("example") TVideoExample paramTVideoExample);

  public abstract int updateByPrimaryKeySelective(TVideo paramTVideo);

  public abstract int updateByPrimaryKey(TVideo paramTVideo);
  public List<TVideo> getVideoAll(Page page);
}