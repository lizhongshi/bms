package com.dly.explain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.explain.base.Result;
import com.dly.explain.dao.TCollectMapper;
import com.dly.explain.entity.TCollect;
import com.dly.explain.entity.TCollectExample;
import com.dly.explain.service.CollectService;
@Service
public class CollectServiceImpl  implements CollectService{
	@Resource
	TCollectMapper tCollectMapper;
	@Override
	public Result addCollect(TCollect input) {
		int insert = tCollectMapper.insert(input);
		if(insert>0) {
			return new Result(true,"");
		}
		return new Result(false,"");
	}

	@Override
	public Result getCollects(String userId) {
		TCollectExample ce=new TCollectExample();
		//ce.setOrderByClause("");
		ce.createCriteria().andUserIdEqualTo(Integer.valueOf(userId));
		List<TCollect> selectByExample = tCollectMapper.selectByExample(ce);
		return new Result(true,"",selectByExample);
	}

	@Override
	public Result cancelCollect(TCollect input) {
		if(tCollectMapper.deleteByPrimaryKey(input.getId())>0) {
			return new Result(true,"");
		}
		return new Result(false,"");
	}

}
