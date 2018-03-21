package com.dly.explain.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TCollect;
import com.dly.explain.service.CollectService;

@RestController
@RequestMapping("api")
public class CollectController {
	@Resource
	CollectService collectService;
	//添加收藏
	@PostMapping(value="collect",produces = "application/json;charset=UTF-8")
	public Result addCollect(@RequestBody TCollect input) {
		return collectService.addCollect(input);
	}
	//取消收藏
	@DeleteMapping(value="collect",produces = "application/json;charset=UTF-8")
	public Result cancelCollect(@RequestBody TCollect input) {
		return collectService.cancelCollect(input);
	}
	//获取所有收藏
	@GetMapping(value="collects",produces = "application/json;charset=UTF-8")
	public Result getCollects(String userId) {
		return collectService.getCollects(userId);
	}
//	@GetMapping(value="collect/{userId}",produces = "application/json;charset=UTF-8")
//	public Result getPostComments(@PathVariable String postId) {
//		return commentService.getPostComments( postId);
//	}
	
}
