package com.dly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dly.entity.Moudle_m;

@Mapper
public interface MoudleDAO {
	public List<Moudle_m> getMoudleAll();

}
