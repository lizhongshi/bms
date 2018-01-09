package com.dly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dly.entity.Group_m;


public interface GroupDAO {
	public List<Group_m> test();
	public List<Group_m>  getGroupByCountyIdAndMoudleIdAndLevelId(Group_m group);
	public List<Group_m> getAll();
	public int insertGroup(Group_m group);
	public int deleteGroupById(Integer id);
	public  int  editGroupById(Group_m group);

}
