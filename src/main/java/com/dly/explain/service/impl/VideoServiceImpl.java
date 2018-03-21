package com.dly.explain.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.csource.common.MyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.dly.explain.base.Result;
import com.dly.explain.dao.TVideoMapper;
import com.dly.explain.entity.TVideo;
import com.dly.explain.entity.TVideoExample;
import com.dly.explain.service.VideoService;
import com.dly.explain.util.FileUtil;
import com.dly.explain.vo.Page;
import com.github.pagehelper.PageHelper;



@Service
@Transactional
public class VideoServiceImpl
  implements VideoService
{
	Logger log=Logger.getLogger(VideoServiceImpl.class);

  @Resource
  TVideoMapper tVideoMapper;

  public List<TVideo> getVideoAll(Page page)
  {
	  if(page.getIndex()==null||page.getSize()==null) {
		  return tVideoMapper.selectByExample(null);
	  }else {
		  PageHelper.startPage(page.getIndex(), page.getSize());
	  }
	  
    return tVideoMapper.selectByExample(null);
     // this.tVideoMapper.getVideoAll(page);
  }

  public Result upload(MultipartFile file, String title, HttpServletRequest request){
	  String filePath = request.getSession().getServletContext().getRealPath("/static/videoUpload/");
	 TVideoExample tVideoExample = new TVideoExample();
	 String fileName=file.getOriginalFilename();
	 tVideoExample.createCriteria().andUrlEqualTo(fileName);
	 List<TVideo> selectByExample = tVideoMapper.selectByExample(tVideoExample);
	 if(selectByExample.size()>0) {
		 return new Result(false,"视频名称重复");
	 }
	  BufferedOutputStream out = null;
	try {
		log.info("开始上传:"+filePath);
		out = new BufferedOutputStream(
		         new FileOutputStream(new File(fileName)));
			out.write(file.getBytes());
			TVideo TVideo = new TVideo();
			TVideo.setUrl(fileName);
			TVideo.setTitle(title);
			this.tVideoMapper.insert(TVideo);		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		 return new Result(false,"上传失败");
	}finally {
		try {
			out.close();
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
			 return new Result(false,"上传失败");
		}
	}
	return new Result(true,"上传成功");
  }

  public Result deleteVideo(Integer id, String path,HttpServletRequest request)
  {
	  try {
	  String filePath = request.getSession().getServletContext().getRealPath("/static/videoUpload/");
	  FileUtil.deleteFile(filePath+path);
	  if( tVideoMapper.deleteByPrimaryKey(id)>1) {
		  return new Result(true,"删除成功");
	  }
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
   return new Result(false,"删除成功");
  }
}