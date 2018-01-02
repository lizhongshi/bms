package com.dly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.dly.entity.County_m;

@Mapper
public interface CountyDAO {
	public List<County_m> getCountyAll();

}
