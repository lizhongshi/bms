package com.dly.service;

import java.util.List;

import com.dly.entity.Group_m;
import com.dly.entity.Level;
import com.dly.entity.Result;
import com.dly.entity.TGroup;

public interface GroupService {
	public List<TGroup>  findGroupAll();
	public int insertGroup(TGroup group);
	public List<TGroup> findGroupByMoudleId(TGroup group);
	public Result deleteGroup(Integer id);
	public List<Level> getLevel();
	public int  editGroupById(TGroup group);

	

}
