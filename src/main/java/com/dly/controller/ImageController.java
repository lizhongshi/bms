package com.dly.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dly.entity.Page;
import com.dly.entity.Result;
import com.dly.entity.Video;
import com.dly.service.FastdfsService;
import com.dly.service.ImageService;
import com.dly.util.FastdfsClient;

@RestController
@RequestMapping({"image"})
public class ImageController
{
 Logger log=Logger.getLogger(ImageController.class);
  @Resource
  ImageService ImageService;
  @Resource
  FastdfsClient FastdfsClient;
  @Resource
  FastdfsService fastdfsService;
  @RequestMapping({"all"})
  public Object getImageAll(Page page)
  {
	  System.out.println("分页:"+page);
    return this.ImageService.getImageAll(page);
  }
  @DeleteMapping
  public Object delete(@RequestBody Video video) {
    System.out.println("deleteImage--->" + video);
    return this.ImageService.deleteImage(video);
  }
	 @PostMapping(value = "imageUpload",produces = "application/json;charset=UTF-8")
	 public Object imageFileUpload( MultipartFile[] file) throws IOException {
	        long  startTime=System.currentTimeMillis();
	        Result result = null;
	        for (int i = 0; i < file.length; i++) {
	        	
	        	System.out.println("fileName："+file[i].getOriginalFilename());
	        	
	        	result = fastdfsService.upLoadImage(file[i]);
	        	if(!result.isSuccess()) {
	        		return new Result(false, "上传图片失败", "");
	        	}
	        }
		
		       log.info("上传文件返回===:"+result);
		       long  endTime=System.currentTimeMillis();
		       log.info("上传文件耗时===:"+(endTime-startTime));
				return result;
	    }
}