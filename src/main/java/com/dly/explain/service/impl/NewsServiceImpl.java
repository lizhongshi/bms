package com.dly.explain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.dly.explain.base.Result;
import com.dly.explain.dao.TNewsMapper;
import com.dly.explain.entity.TNews;
import com.dly.explain.service.NewsService;

public class NewsServiceImpl implements NewsService{
	
	@Resource
	TNewsMapper tNewsMapper;
	@Override
	public Result getNewss() {
		// TODO Auto-generated method stub
		List<TNews> selectByExample = tNewsMapper.selectByExample(null);
		return new Result(true, "",selectByExample );
	}

	@Override
	public Result getNews(String id) {
		// TODO Auto-generated method stub  
		return null;
	}

	@Override
	public Result addNews(TNews input) {
		// TODO Auto-generated method stub
		return null;
	}

}
