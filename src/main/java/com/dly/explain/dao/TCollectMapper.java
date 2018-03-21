package com.dly.explain.dao;

import com.dly.explain.entity.TCollect;
import com.dly.explain.entity.TCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCollectMapper {
    long countByExample(TCollectExample example);

    int deleteByExample(TCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCollect record);

    int insertSelective(TCollect record);

    List<TCollect> selectByExample(TCollectExample example);

    TCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCollect record, @Param("example") TCollectExample example);

    int updateByExample(@Param("record") TCollect record, @Param("example") TCollectExample example);

    int updateByPrimaryKeySelective(TCollect record);

    int updateByPrimaryKey(TCollect record);
}