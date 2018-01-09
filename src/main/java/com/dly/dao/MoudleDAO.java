package com.dly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dly.entity.Moudle_m;

public interface MoudleDAO {
	public List<Moudle_m> getMoudleAll();
	public int deleteMoudleById(Integer id);
	public int editMoudleById(Moudle_m moudle) ;
	public int addMoudle(Moudle_m moudle) ;

}
