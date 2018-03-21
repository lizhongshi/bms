package com.dly.explain.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.explain.base.Result;
import com.dly.explain.entity.TComment;
import com.dly.explain.service.CommentService;

@RestController
@RequestMapping("api")
public class CommentController {
	@Resource
	CommentService commentService;
	
	@PostMapping(value="comment",produces = "application/json;charset=UTF-8")
	public Result addComment(@RequestBody TComment input) {
		return commentService.addComment(input);
	}
//	@GetMapping(value="comments",produces = "application/json;charset=UTF-8")
//	public Result getPosts() {
//		return postService.getPosts();
//	}
	@GetMapping(value="comment/{postId}",produces = "application/json;charset=UTF-8")
	public Result getPostComments(@PathVariable String postId) {
		return commentService.getPostComments( postId);
	}
	
}
