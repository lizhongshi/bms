package com.dly.service.impl;

import com.dly.dao.TMoudleMapper;
import com.dly.entity.Result;
import com.dly.entity.TMoudle;
import com.dly.service.MoudleService;
import java.io.PrintStream;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MoudleServiceImpl
  implements MoudleService
{

  @Resource
  TMoudleMapper TMoudleMapper;

  public List<TMoudle> findMoudleAll()
  {
    List l = this.TMoudleMapper.selectByExample(null);
    System.out.println(l);
    return l;
  }

  public Result deleteMoudleById(Integer id) {
    Result result = null;
    try {
      if (this.TMoudleMapper.deleteByPrimaryKey(id) > 0)
        result = new Result(true, "成功", "");
      else
        result = new Result(false, "成功", "");
    }
    catch (Exception e)
    {
      result = new Result(false, "", e.getMessage());
    }

    return result;
  }

  public Result editMoudleById(TMoudle moudle) {
    Result result = null;
    try {
      if (this.TMoudleMapper.updateByPrimaryKey(moudle) > 0)
        result = new Result(true, "修改成功", "");
      else
        result = new Result(false, "修改失败", "");
    }
    catch (Exception e)
    {
      result = new Result(false, "修改失败", e.getMessage());
    }

    return result;
  }

  public Result addMoudle(TMoudle moudle)
  {
    Result result = null;
    if (this.TMoudleMapper.insert(moudle) > 0)
      result = new Result(true, "成功", "");
    else {
      result = new Result(false, "失败", "");
    }
    return result;
  }
}