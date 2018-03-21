package com.dly.explain.dao;

import com.dly.explain.entity.TPostImg;
import com.dly.explain.entity.TPostImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPostImgMapper {
    long countByExample(TPostImgExample example);

    int deleteByExample(TPostImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPostImg record);

    int insertSelective(TPostImg record);

    List<TPostImg> selectByExample(TPostImgExample example);

    TPostImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPostImg record, @Param("example") TPostImgExample example);

    int updateByExample(@Param("record") TPostImg record, @Param("example") TPostImgExample example);

    int updateByPrimaryKeySelective(TPostImg record);

    int updateByPrimaryKey(TPostImg record);
}