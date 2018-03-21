package com.dly.explain.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.dly.explain.base.Result;
import com.dly.explain.service.ImageService;

public class ImageServiceImpl implements  ImageService{

	@Override
	public Result addPost(MultipartFile[] file, String userId, String body, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result getPosts() {
		// TODO Auto-generated method stub
		return null;
	}

}
