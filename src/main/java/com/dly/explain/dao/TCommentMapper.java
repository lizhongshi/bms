package com.dly.explain.dao;

import com.dly.explain.entity.TComment;
import com.dly.explain.entity.TCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommentMapper {
    long countByExample(TCommentExample example);

    int deleteByExample(TCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TComment record);

    int insertSelective(TComment record);

    List<TComment> selectByExample(TCommentExample example);

    TComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TComment record, @Param("example") TCommentExample example);

    int updateByExample(@Param("record") TComment record, @Param("example") TCommentExample example);

    int updateByPrimaryKeySelective(TComment record);

    int updateByPrimaryKey(TComment record);
   List< TComment> getPostComments(String postId);
}