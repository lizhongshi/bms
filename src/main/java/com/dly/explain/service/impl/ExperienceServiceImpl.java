package com.dly.explain.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.explain.base.Result;
import com.dly.explain.service.ExperienceService;
import com.dly.explain.util.RedisCacheUtil;
import com.dly.explain.util.Util;
@Service
public class ExperienceServiceImpl implements ExperienceService {
	//private static String KEY="experience";
	@Resource
	RedisCacheUtil redisCacheUtil;
	@Override
	public Result getExperienceCode() {
		
		String code=Util.getUUID().substring(0,12);
		if(redisCacheUtil.exists(ExperienceService.KEY+ code)) {
			getExperienceCode();
		}else {
			redisCacheUtil.cacheValue(ExperienceService.KEY+code, code, 172800);
			redisCacheUtil.upKey(ExperienceService.KEY+code, 172800);
		}
		return new Result(true,"",code);
	}

}
