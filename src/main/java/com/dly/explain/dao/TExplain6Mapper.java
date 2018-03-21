package com.dly.explain.dao;

import com.dly.explain.entity.TExplain6;
import com.dly.explain.entity.TExplain6Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExplain6Mapper {
    long countByExample(TExplain6Example example);

    int deleteByExample(TExplain6Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExplain6 record);

    int insertSelective(TExplain6 record);

    List<TExplain6> selectByExample(TExplain6Example example);

    TExplain6 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TExplain6 record, @Param("example") TExplain6Example example);

    int updateByExample(@Param("record") TExplain6 record, @Param("example") TExplain6Example example);

    int updateByPrimaryKeySelective(TExplain6 record);

    int updateByPrimaryKey(TExplain6 record);
    List<TExplain6> getPinyin(String pinyin);
}