package com.dly.service.impl;

import com.dly.dao.TPushMapper;
import com.dly.entity.Result;
import com.dly.entity.TPush;
import com.dly.entity.TPushExample;
import com.dly.service.PushService;
import com.dly.util.JpushUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PushServiceImpl
  implements PushService
{

  @Resource
  TPushMapper tPushMapper;

  @Resource
  JpushUtil jpushUtil;

  public Result push(TPush t)
  {
    if (("".equals(t.getTitle())) || ("".equals(t.getBody())))
      return new Result(false, "99", "推送消息不能为空");
    try
    {
      this.jpushUtil.push(t.getBody());
      if (this.tPushMapper.insert(t) > 0) {
        return new Result(true, "0", "推送成功");
      }
      return new Result(false, "99", "推送失败");
    }
    catch (Exception e)
    {
      e.printStackTrace();
      return new Result(false, "99", e.getMessage());
    }
  }

  public List<TPush> get()
  {
    TPushExample tPushExample = new TPushExample();
    tPushExample.setOrderByClause("id DESC");
    List<TPush> result = this.tPushMapper.selectByExample(tPushExample);
    for (TPush tPush : result) {
      Date date = tPush.getDate();

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
      tPush.setDateval(sdf.format(date));
    }
    return result;
  }
}