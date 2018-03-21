package com.dly.explain.service;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TExplain;

public interface ExplainService {
	public  Result explain(String str,String type) ;
	public Result addExplain(TExplain inpu);
}
