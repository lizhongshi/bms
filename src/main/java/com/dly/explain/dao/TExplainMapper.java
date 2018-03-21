package com.dly.explain.dao;

import com.dly.explain.entity.TExplain;
import com.dly.explain.entity.TExplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExplainMapper {
    long countByExample(TExplainExample example);

    int deleteByExample(TExplainExample example);

    int insert(TExplain record);

    int insertSelective(TExplain record);

    List<TExplain> selectByExample(TExplainExample example);

    int updateByExampleSelective(@Param("record") TExplain record, @Param("example") TExplainExample example);

    int updateByExample(@Param("record") TExplain record, @Param("example") TExplainExample example);
   List<String> getPinyinByzw(String zw);
}