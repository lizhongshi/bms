package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.Repository.MoudleRepository;
import com.dly.Repository.UserRepository;
import com.dly.entity.Moudle;
import com.dly.entity.User;
import com.dly.service.MoudleService;
import com.dly.service.UserService;
@Service()
public class MoudleServiceImpl  implements MoudleService{
	@Resource
	MoudleRepository moudleRepository;

	@Override
	public List<Moudle> findMoudleAll() {
		
		return moudleRepository.findAll();
	}

	
}
