package com.dly.service.impl;

import com.dly.dao.TCarouselMapper;
import com.dly.entity.Result;
import com.dly.entity.TCarousel;
import com.dly.entity.TCarouselExample;
import com.dly.service.CarouselService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarouselServiceImple
  implements CarouselService
{

  @Resource
  TCarouselMapper tCarouselMapper;

  public Object getCarousel()
  {
    TCarouselExample TCarouselExample = new TCarouselExample();
    TCarouselExample.setOrderByClause("ordered ");
    return this.tCarouselMapper.selectByExample(TCarouselExample);
  }

  public Object deleteCarousel(Integer id)
  {
    if (this.tCarouselMapper.deleteByPrimaryKey(id) > 0) {
      return new Result(true, "删除成功", "");
    }
    return new Result(false, "删除失败", "");
  }

  public Object addCarousel(TCarousel tCarousel) {
    if (this.tCarouselMapper.insert(tCarousel) > 0) {
      return new Result(true, "添加成功", "");
    }
    return new Result(false, "添加失败", "");
  }

  public Object editCarousel(TCarousel tCarousel) {
    if (this.tCarouselMapper.updateByPrimaryKey(tCarousel) > 0) {
      return new Result(true, "修改成功", "");
    }
    return new Result(false, "修改失败", "");
  }
}