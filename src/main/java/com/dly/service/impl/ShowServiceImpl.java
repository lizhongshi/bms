package com.dly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.dao.ShowDAO;
import com.dly.service.ShowService;
@Service
public class ShowServiceImpl  implements ShowService{
	@Resource
	ShowDAO showDAO;
	@Override
	public Object show() {
		
		return showDAO.getShow();
	}

}
