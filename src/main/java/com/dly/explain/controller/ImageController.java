//package com.dly.explain.controller;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.websocket.server.PathParam;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.dly.explain.base.Result;
//import com.dly.explain.service.PostService;
//
//@RestController
//@RequestMapping("api")
//public class ImageController {
//	@Resource
//	PostService postService;
//	
//	@PostMapping(value="post",produces = "application/json;charset=UTF-8")
//	public Result addPost(MultipartFile[] file,String userId,String body, HttpServletRequest request) {
//		return postService.addPost(file, userId, body,request);
//	}
//	
//}
