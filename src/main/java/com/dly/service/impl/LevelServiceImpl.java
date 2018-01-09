package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dly.dao.LevelDAO;
import com.dly.entity.Level_m;
import com.dly.service.LevelService;
@Service
@Transactional
public class LevelServiceImpl  implements LevelService{
	
	@Resource
	LevelDAO levelDAO;
	@Override
	public List<Level_m> getLevelAll() {
		
		return levelDAO.getLevelAll();
	}

}
