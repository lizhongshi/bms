package com.dly.explain.dao;

import com.dly.explain.entity.TExplain12;
import com.dly.explain.entity.TExplain12Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExplain12Mapper {
    long countByExample(TExplain12Example example);

    int deleteByExample(TExplain12Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExplain12 record);

    int insertSelective(TExplain12 record);

    List<TExplain12> selectByExample(TExplain12Example example);

    TExplain12 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TExplain12 record, @Param("example") TExplain12Example example);

    int updateByExample(@Param("record") TExplain12 record, @Param("example") TExplain12Example example);

    int updateByPrimaryKeySelective(TExplain12 record);

    int updateByPrimaryKey(TExplain12 record);
}