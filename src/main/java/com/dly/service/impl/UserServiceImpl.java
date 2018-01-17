package com.dly.service.impl;

import com.dly.dao.TAdminMapper;
import com.dly.entity.Result;
import com.dly.entity.TAdmin;
import com.dly.entity.TAdminExample;
import com.dly.entity.TAdminExample.Criteria;
import com.dly.service.UserService;
import com.dly.util.Util;
import java.util.List;
import javax.annotation.Resource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl
  implements UserService
{

  @Resource
  TAdminMapper tAdminMapper;

  public Result login(TAdmin user)
  {
    TAdminExample example = new TAdminExample();
    TAdminExample.Criteria criteria = example.createCriteria();
    criteria.andUserNameEqualTo(user.getUserName());
    List result =tAdminMapper.selectByExample(example);
    if (result.size() > 0) {
      TAdmin admin = (TAdmin)result.get(0);
      UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), Util.Md5(user.getPassword(), admin.getSalt()));
      Subject subject = SecurityUtils.getSubject();
      try {
        subject.login(token);
        return new Result(true, "登录成功", "");
      } catch (Exception e) {
        e.printStackTrace();
        return new Result(false, "用户名或密码错误", "");
      }
    }
    return new Result(false, "用户名或密码错误", "");
  }

  public Result register(TAdmin user)
  {
    String salt = Util.getUUID();
    String pass = Util.Md5(user.getPassword(), salt);
    TAdminExample example = new TAdminExample();
    TAdminExample.Criteria criteria = example.createCriteria();
    criteria.andUserNameEqualTo(user.getUserName());
    List result = this.tAdminMapper.selectByExample(example);
    if (result.size() > 0) {
      return new Result(false, "账户已存在", "");
    }
    user.setPassword(pass);
    user.setSalt(salt);
    if (this.tAdminMapper.insert(user) > 0) {
      return new Result(true, "注册成功", "");
    }
    return new Result(false, "注册失败", "");
  }
}