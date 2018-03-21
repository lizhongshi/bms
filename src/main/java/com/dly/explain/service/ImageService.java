package com.dly.explain.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import com.dly.explain.base.Result;

public interface ImageService {
	public Result addPost(MultipartFile[] file,String userId,String body, HttpServletRequest request);
	public Result getPosts();
}
