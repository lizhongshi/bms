package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.Repository.CountyRepository;
import com.dly.entity.County;
import com.dly.service.CountyService;
@Service()
public class CountyServiceImpl  implements CountyService{
	@Resource
	CountyRepository CountyRepository;

	@Override
	public List<County> findCountyAll() {	
		return CountyRepository.findAll();
	}
	
	



	
}
