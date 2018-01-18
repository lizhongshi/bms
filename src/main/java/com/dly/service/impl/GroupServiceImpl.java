package com.dly.service.impl;

import com.dly.Repository.GroupRepository;
import com.dly.Repository.LevelRepository;
import com.dly.dao.GroupDAO;
import com.dly.dao.TGroupImageMapper;
import com.dly.dao.TGroupMapper;
import com.dly.entity.Level;
import com.dly.entity.Result;
import com.dly.entity.TGroup;
import com.dly.entity.TGroupExample;
import com.dly.entity.TGroupExample.Criteria;
import com.dly.entity.TGroupImage;
import com.dly.entity.TGroupImageExample;
import com.dly.service.GroupService;
import com.dly.util.StringUtil;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GroupServiceImpl
  implements GroupService
{

  @Resource
  GroupRepository groupRepository;

  @Resource
  LevelRepository levelRepository;

  @Resource
  GroupDAO groupDAO;

  @Resource
  TGroupMapper tGroupMapper;

  @Resource
  TGroupImageMapper tGroupImageMapper;

  public List<TGroup> findGroupAll()
  {
    List result = this.tGroupMapper.selectGroupAll();
    for (int i = 0; i < result.size(); i++) {
      TGroup g = (TGroup)result.get(i);

      if ("1".equals(g.getIstp()))
        g.setIstp("是");
      else {
        g.setIstp("否");
      }
    }
    return result;
  }

  public int insertGroup(TGroup group)
  {
    this.tGroupMapper.insert(group);
    if (StringUtil.isNotEmpty(group.getImages())) {
      List list = new ArrayList();
      String[] images = group.getImages().split(",");
      for (int i = 0; i < images.length; i++) {
        TGroupImage TGroupImage = new TGroupImage();
        TGroupImage.setGroupId(group.getId());
        TGroupImage.setImageId(Integer.valueOf(images[i]));
        list.add(TGroupImage);
      }
      this.tGroupImageMapper.insert(list);
    }
    return 0;
  }

  public List<TGroup> findGroupByMoudleId(TGroup group)
  {
    TGroupExample TGroupExample = new TGroupExample();
    TGroupExample.Criteria Criteria = TGroupExample.createCriteria();
    if (group.getCountyId() != null)
    {
      Criteria.andCountyIdEqualTo(group.getCountyId());
    }
    if (group.getMoudleId() != null)
    {
      Criteria.andMoudleIdEqualTo(group.getMoudleId());
    }
    if (group.getLevelId() != null)
    {
      Criteria.andLevelIdEqualTo(group.getLevelId());
    }
    List result = this.tGroupMapper.selectByExample(TGroupExample);
    for (int i = 0; i < result.size(); i++) {
      TGroup g = (TGroup)result.get(i);
      TGroupImageExample tGroupImageExample = new TGroupImageExample();
      tGroupImageExample.createCriteria().andGroupIdEqualTo(g.getId());
      List Image = this.tGroupImageMapper.selectByExample(tGroupImageExample);
      String id = "";
      for (int j = 0; j < Image.size(); j++) {
        if (j != 0)
        {
          id = id + "," + String.valueOf(((TGroupImage)Image.get(j)).getImageId());
        }
        else id = id + String.valueOf(((TGroupImage)Image.get(j)).getImageId());
      }

      g.setImages(id);

      if ("1".equals(g.getIstp()))
        g.setIstp("是");
      else {
        g.setIstp("否");
      }
    }
    StringUtil.isNotEmpty(group.getImages());

    return result;
  }

  public Result deleteGroup(Integer id)
  {
    try
    {
      this.groupDAO.deleteGroupById(id);
    } catch (Exception e) {
      return new Result(false, "删除失败", "");
    }

    return new Result(true, "删除成功", "");
  }

  public List<Level> getLevel()
  {
    return this.levelRepository.findAll();
  }

  public int editGroupById(TGroup group)
  {
    if (StringUtil.isNotEmpty(group.getImages())) {
      TGroupImageExample Example = new TGroupImageExample();
      Example.createCriteria().andGroupIdEqualTo(group.getId());
      this.tGroupImageMapper.deleteByExample(Example);
      List list = new ArrayList();
      String[] images = group.getImages().split(",");
      for (int i = 0; i < images.length; i++) {
        TGroupImage TGroupImage = new TGroupImage();
        TGroupImage.setGroupId(group.getId());
        TGroupImage.setImageId(Integer.valueOf(images[i]));
        list.add(TGroupImage);
      }
      this.tGroupImageMapper.insert(list);
    } else {
      TGroupImageExample Example = new TGroupImageExample();
      Example.createCriteria().andGroupIdEqualTo(group.getId());
      this.tGroupImageMapper.deleteByExample(Example);
    }
    return this.tGroupMapper.updateByPrimaryKeySelective(group);
  }
}