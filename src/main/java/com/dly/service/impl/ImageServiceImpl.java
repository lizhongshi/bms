package com.dly.service.impl;

import com.dly.dao.ImageDAO;
import com.dly.dao.TImageMapper;
import com.dly.entity.Image;
import com.dly.entity.Result;
import com.dly.entity.Video;
import com.dly.service.ImageService;
import com.dly.util.FastdfsClient;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImageServiceImpl
  implements ImageService
{

  @Resource
  ImageDAO imageDAO;

  @Resource
  TImageMapper tImageMapper;

  public List<Image> getImageAll()
  {
    return this.imageDAO.getImageAll();
  }

  public Result deleteImage(Video video) {
    String path = video.getPath();
    String group = path.substring(1, path.indexOf("/", 2));
    String url = path.substring(path.indexOf("/", 2) + 1, path.length());
    FastdfsClient.delete(group, url);
    this.tImageMapper.deleteByPrimaryKey(video.getId());
    return new Result(true, "删除成功", "");
  }
}