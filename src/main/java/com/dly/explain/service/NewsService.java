package com.dly.explain.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TNews;

public interface NewsService {
	public  Result getNewss() ;
	public  Result getNews( String id) ;
	public  Result addNews( TNews input) ;
}
