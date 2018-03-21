package com.dly.explain.service;


import com.dly.explain.base.Result;
import com.dly.explain.entity.TComment;

public interface CommentService {
	public Result addComment(TComment input) ;
	public Result getPostComments(String postId);
}
