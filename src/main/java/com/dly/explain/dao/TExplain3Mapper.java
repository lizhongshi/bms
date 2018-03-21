package com.dly.explain.dao;

import com.dly.explain.entity.TExplain3;
import com.dly.explain.entity.TExplain3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExplain3Mapper {
    long countByExample(TExplain3Example example);

    int deleteByExample(TExplain3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExplain3 record);

    int insertSelective(TExplain3 record);

    List<TExplain3> selectByExample(TExplain3Example example);

    TExplain3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TExplain3 record, @Param("example") TExplain3Example example);

    int updateByExample(@Param("record") TExplain3 record, @Param("example") TExplain3Example example);

    int updateByPrimaryKeySelective(TExplain3 record);

    int updateByPrimaryKey(TExplain3 record);
}