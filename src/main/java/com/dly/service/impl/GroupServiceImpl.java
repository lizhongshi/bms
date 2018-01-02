package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.Repository.GroupRepository;
import com.dly.Repository.LevelRepository;
import com.dly.dao.GroupDAO;
import com.dly.entity.Group;
import com.dly.entity.Group_m;
import com.dly.entity.Level;
import com.dly.entity.Result;
import com.dly.service.GroupService;
@Service()
public class GroupServiceImpl  implements GroupService{
	@Resource
	GroupRepository groupRepository;
	@Resource
	LevelRepository levelRepository;
	@Resource
	GroupDAO groupDAO;

	@Override
	public List<Group_m> findGroupAll() {
		
		return groupDAO.getAll();
	}

	@Override
	public int insertGroup(Group group) {
		groupRepository.save(group);
		return 0;
	}

	@Override
	public List<Group_m> findGroupByMoudleId(Integer moudleId, Integer countyId,Integer levelId) {
		Group_m g=new Group_m();
		g.setMoudleId(moudleId);
		g.setCountyId(countyId);
		g.setLevelId(levelId);
		return groupDAO.getGroupByCountyIdAndMoudleIdAndLevelId(g);
	}

	@Override
	public Result deleteGroup(Integer id) {
		
		try{
			groupRepository.delete(id);
		}catch(Exception e	) {
			return new Result(false, "删除失败", "");
		}
		
		
		return new Result(true, "删除成功", "");
	}

	@Override
	public List<Level> getLevel() {
		
		return levelRepository.findAll();
	}


	
}
