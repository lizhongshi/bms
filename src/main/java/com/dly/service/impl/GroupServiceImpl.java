package com.dly.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Service()
@Transactional
public class GroupServiceImpl  implements GroupService{
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
	
	@Override
	public List<TGroup> findGroupAll() {
		List<TGroup> result=	tGroupMapper.selectByExample(null);
		for (int i = 0; i < result.size(); i++) {
			TGroup g=result.get(i);
			
			if("1".equals(g.getIstp())){
				g.setIstp("是");
			}else {
				g.setIstp("否");
			}
		}
		return result;
	}

	@Override
	public int insertGroup(TGroup group) {
	tGroupMapper.insert(group);
		if(StringUtil.isNotEmpty(group.getImages())) {
			List <TGroupImage>list =new ArrayList<TGroupImage>();
			String[] images=group.getImages().split(",");
			for (int i = 0; i < images.length; i++) {
				TGroupImage TGroupImage=new TGroupImage();
				TGroupImage.setGroupId(group.getId());
				TGroupImage.setImageId(Integer.valueOf(images[i]));;
				list.add(TGroupImage);
			}
			tGroupImageMapper.insert(list);
		}
		return 0;
	}

	@Override
	public List<TGroup> findGroupByMoudleId(TGroup group) {
		TGroupExample TGroupExample=new TGroupExample();
		Criteria Criteria=		TGroupExample.createCriteria();
		if(null!=group.getCountyId()) {
		
			Criteria.andCountyIdEqualTo(group.getCountyId());
		}
		if(null!=group.getMoudleId()) {
					
			Criteria.andMoudleIdEqualTo(group.getMoudleId());
				}
		if(null!=group.getLevelId()) {
			
			Criteria.andLevelIdEqualTo(group.getLevelId());
		}
		 List<TGroup> result=	tGroupMapper.selectByExample(TGroupExample);
		for (int i = 0; i < result.size(); i++) {
			TGroup g=result.get(i);
			TGroupImageExample tGroupImageExample=new TGroupImageExample();
			tGroupImageExample.createCriteria().andGroupIdEqualTo(g.getId());
			List<TGroupImage> Image =	tGroupImageMapper.selectByExample(tGroupImageExample);
			String id="";
			for (int j = 0; j <Image.size(); j++) {
				if(j!=0) {
					
					id+=","+String.valueOf(Image.get(j).getImageId());
				}else {
					id+=String.valueOf(Image.get(j).getImageId());
				}
			}
			g.setImages(id);
			
			if("1".equals(g.getIstp())){
				g.setIstp("是");
			}else {
				g.setIstp("否");
			}
		}
		if(StringUtil.isNotEmpty(group.getImages())) {
			
		}
		return result;
		
	}

	@Override
	public Result deleteGroup(Integer id) {
		
		try{
			groupDAO.deleteGroupById(id);
		}catch(Exception e	) {
			return new Result(false, "删除失败", "");
		}
		
		
		return new Result(true, "删除成功", "");
	}

	@Override
	public List<Level> getLevel() {
		
		return levelRepository.findAll();
	}

	@Override
	public int editGroupById(TGroup group) {
		
		if(StringUtil.isNotEmpty(group.getImages())) {
			TGroupImageExample Example=new TGroupImageExample();
			Example.createCriteria().andGroupIdEqualTo(group.getId());
			tGroupImageMapper.deleteByExample(Example);
			List <TGroupImage>list =new ArrayList<TGroupImage>();
			String[] images=group.getImages().split(",");
			for (int i = 0; i < images.length; i++) {
				TGroupImage TGroupImage=new TGroupImage();
				TGroupImage.setGroupId(group.getId());
				TGroupImage.setImageId(Integer.valueOf(images[i]));;
				list.add(TGroupImage);
			}
			tGroupImageMapper.insert(list);
		}else {
			TGroupImageExample Example=new TGroupImageExample();
			Example.createCriteria().andGroupIdEqualTo(group.getId());
			tGroupImageMapper.deleteByExample(Example);
		}
		return	tGroupMapper.updateByPrimaryKeySelective(group);
	}


	
}
