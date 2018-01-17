package com.dly.service.impl;

import com.dly.dao.TVideoMapper;
import com.dly.entity.Result;
import com.dly.entity.TVideo;
import com.dly.service.VideoService;
import com.dly.util.FastdfsClient;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.csource.common.MyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class VideoServiceImpl
  implements VideoService
{

  @Resource
  TVideoMapper tVideoMapper;

  public List<TVideo> getVideoAll()
  {
    return 
      this.tVideoMapper.selectByExample(null);
  }

  public Result upload(MultipartFile file, String title)
  {
    Map map = new HashMap();
    map.put("title", title);
    try {
      String[] result = FastdfsClient.upLoad(file, map);
      TVideo TVideo = new TVideo();
      TVideo.setUrl("/" + result[0] + "/" + result[1]);
      TVideo.setTitle(title);
      this.tVideoMapper.insert(TVideo);
    }
    catch (MyException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
      return new Result(false, "视频上传失败", e.getMessage());
    }
    return new Result(true, "视频上传成功", "");
  }

  public Result deleteVideo(Integer id, String path)
  {
    String group = path.substring(1, path.indexOf("/", 2));
    String url = path.substring(path.indexOf("/", 2) + 1, path.length());
    FastdfsClient.delete(group, url);
    if (this.tVideoMapper.deleteByPrimaryKey(id) > 0)
    {
      return new Result(true, "视频删除成功", "");
    }
    return new Result(false, "视频删除失败", "");
  }
}