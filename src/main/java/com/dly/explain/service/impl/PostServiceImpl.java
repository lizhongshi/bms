package com.dly.explain.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dly.explain.base.Result;
import com.dly.explain.dao.TPostMapper;
import com.dly.explain.entity.TPost;
import com.dly.explain.entity.TPostImg;
import com.dly.explain.service.PostService;
import com.dly.explain.util.Util;
@Service
public class PostServiceImpl implements PostService {
	@Resource
	TPostMapper tPostMapper;
	@SuppressWarnings("resource")
	@Override
	public Result addPost(MultipartFile[] file, String userId, String body, HttpServletRequest request)  {
		String filePath = request.getSession().getServletContext().getRealPath("/static/imgUpload/");
		
		BufferedOutputStream out = null;
		TPost post=new TPost();
		post.setUserId(Integer.valueOf(userId));
		post.setCreateTime(new Date());
		post.setBody(body);
		tPostMapper.insert(post);
		for (int i = 0; i < file.length; i++) {
			try {
			String fileName=Util.getUUID();
			out = new BufferedOutputStream(
			         new FileOutputStream(new File(filePath+fileName)));
				out.write(file[i].getBytes());
				TPostImg pi=new TPostImg();
				pi.setPath(fileName);
				pi.setPostId(post.getId());
	        }
			catch (IOException e) {
			e.printStackTrace();
			}finally {
				try {
					out.close();
					out.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return new Result(true, "上传成功");
	}
	@Override
	public Result getPosts() {
		List<TPost> selectByExample = tPostMapper.getPosts();
		return new Result(true, "", selectByExample);
	}

	
	

}
