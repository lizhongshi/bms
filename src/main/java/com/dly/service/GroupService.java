package com.dly.service;

import java.util.List;

import com.dly.entity.Group;
import com.dly.entity.Group_m;
import com.dly.entity.Level;
import com.dly.entity.Result;

public interface GroupService {
	public List<Group_m>  findGroupAll();
	public int insertGroup(Group group);
	public List<Group_m> findGroupByMoudleId(Integer  moudleId,Integer countyId,Integer levelId);
	public Result deleteGroup(Integer id);
	public List<Level> getLevel();
	

}
