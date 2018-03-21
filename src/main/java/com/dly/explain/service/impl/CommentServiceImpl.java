package com.dly.explain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dly.explain.base.Result;
import com.dly.explain.dao.TCommentMapper;
import com.dly.explain.entity.TComment;
import com.dly.explain.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService {
	@Resource
	TCommentMapper tCommentMapper;
	@Override
	public Result addComment(TComment input) {
		int insert = tCommentMapper.insert(input);
		if(insert>0) {
			return new Result(true, "");
		}
		return new Result(false, "");
	}

	@Override
	public Result getPostComments(String postId) {
		List<TComment> postComments = tCommentMapper.getPostComments(postId);
		return new Result(true, "", postComments);
	}

}
