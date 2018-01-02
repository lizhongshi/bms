package com.dly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dly.entity.Level_m;
@Mapper
public interface LevelDAO {
	 public List<Level_m> 	getLevelAll();
}
