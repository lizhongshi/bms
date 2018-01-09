package com.dly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dly.Repository.MoudleRepository;
import com.dly.dao.MoudleDAO;
import com.dly.entity.Moudle_m;
import com.dly.entity.Result;
import com.dly.service.MoudleService;
@Service()
@Transactional
public class MoudleServiceImpl  implements MoudleService{
	@Resource
	MoudleRepository moudleRepository;
	@Resource
	MoudleDAO moudleDAO;
	@Override
	public List<Moudle_m> findMoudleAll() {
		List<Moudle_m> l= moudleDAO.getMoudleAll();
		System.out.println(l);
		return  l;
	}
	@Override
	public Result deleteMoudleById(Integer id) {
		Result result=null;
		try {
			if(moudleDAO.deleteMoudleById(id)>0) {
				 result=new Result(true, "", "");
			}else {
				result=new Result(false, "", "");
			}
			
		}catch(Exception e) {
			result=new Result(false, "", e.getMessage());
		}
		
		return result;
	}
	@Override
	public Result editMoudleById(Moudle_m moudle) {
		Result result=null;
		try {
			if(moudleDAO.editMoudleById(moudle)>0) {
				 result=new Result(true, "", "");
			}else {
				result=new Result(false, "", "");
			}
			
		}catch(Exception e) {
			result=new Result(false, "", e.getMessage());
		}
		
		return result;
	
	}
	@Override
	public Result addMoudle(Moudle_m moudle) {
		Result result=null;
		if(moudleDAO.addMoudle(moudle)>0) {
			 result=new Result(true, "", "");
		}else {
			 result=new Result(false, "", "");
		}
		return result;
		
	}

	
}
