package com.dly.explain.dao;

import com.dly.explain.entity.TPost;
import com.dly.explain.entity.TPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPostMapper {
    long countByExample(TPostExample example);

    int deleteByExample(TPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPost record);

    int insertSelective(TPost record);

    List<TPost> selectByExampleWithBLOBs(TPostExample example);

    List<TPost> selectByExample(TPostExample example);

    TPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPost record, @Param("example") TPostExample example);

    int updateByExampleWithBLOBs(@Param("record") TPost record, @Param("example") TPostExample example);

    int updateByExample(@Param("record") TPost record, @Param("example") TPostExample example);

    int updateByPrimaryKeySelective(TPost record);

    int updateByPrimaryKeyWithBLOBs(TPost record);

    int updateByPrimaryKey(TPost record);
    List<TPost> getPosts();
}