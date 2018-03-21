package com.dly.explain.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TCollect;
import com.dly.explain.entity.TComment;

public interface CollectService {
	public Result addCollect(TCollect input);
	public Result getCollects(String userId);
	public Result cancelCollect(TCollect input);

}
