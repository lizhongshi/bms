package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.Repository.MoudleRepository;
import com.dly.dao.MoudleDAO;
import com.dly.entity.Moudle_m;
import com.dly.service.MoudleService;
@Service()
public class MoudleServiceImpl  implements MoudleService{
	@Resource
	MoudleRepository moudleRepository;
	@Resource
	MoudleDAO moudleDAO;
	@Override
	public List<Moudle_m> findMoudleAll() {
		
		return moudleDAO.getMoudleAll();
	}

	
}
