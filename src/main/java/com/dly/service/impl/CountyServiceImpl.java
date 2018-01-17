package com.dly.service.impl;

import com.dly.Repository.CountyRepository;
import com.dly.dao.CountyDAO;
import com.dly.entity.County_m;
import com.dly.service.CountyService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountyServiceImpl
  implements CountyService
{

  @Resource
  CountyRepository CountyRepository;

  @Resource
  CountyDAO countyDAO;

  public List<County_m> findCountyAll()
  {
    return this.countyDAO.getCountyAll();
  }
}