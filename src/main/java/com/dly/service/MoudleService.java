package com.dly.service;

import java.util.List;

import com.dly.entity.Moudle_m;
import com.dly.entity.Result;

public interface MoudleService {
	public List<Moudle_m>  findMoudleAll();
	public Result deleteMoudleById(Integer id);
	public Result editMoudleById(Moudle_m moudle) ;
	public Result addMoudle(Moudle_m moudle) ;

}
