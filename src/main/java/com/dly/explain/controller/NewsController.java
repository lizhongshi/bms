package com.dly.explain.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TNews;
import com.dly.explain.service.NewsService;

@RestController
@RequestMapping("api")
public class NewsController {
	@Resource
	NewsService newsService;
	@GetMapping(value="newss",produces = "application/json;charset=UTF-8")
	public  Result getNewss() {
		return newsService.getNewss();
	}
	@GetMapping(value="news/{id}",produces = "application/json;charset=UTF-8")
	public  Result getNews(@PathVariable String id) {
		return newsService.getNews(id);
	}
	@PostMapping(value="news",produces = "application/json;charset=UTF-8")
	public  Result addNews(@RequestBody TNews input) {
		return newsService.addNews(input);
	}

}

