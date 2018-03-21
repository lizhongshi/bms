package com.dly.explain.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.stereotype.Service;

import com.dly.explain.base.Result;
import com.dly.explain.dao.TExplain6Mapper;
import com.dly.explain.dao.TExplainMapper;
import com.dly.explain.entity.TExplain;
import com.dly.explain.entity.TExplain6;
import com.dly.explain.service.ExplainService;
@Service
public class ExplainServiceImpl implements ExplainService {
	@Resource
	TExplainMapper  tExplainMapper;
	@Resource
	TExplain6Mapper tExplain6Mapper;
	@Override
	public Result explain(String str, String type) {
		switch (type) {
			case "hsk":{
				List<TExplain6> pinyin = tExplain6Mapper.getPinyin(str+"%");
				return new Result(true, "", pinyin);
			}
			case "default":{
				List<String> explain=new ArrayList<String>();
				List<Word> words = WordSegmenter.segWithStopWords(str);
				for (int i = 0; i < words.size(); i++) {
					List<String> result=tExplainMapper.getPinyinByzw(words.get(i).toString());
					if(result.size()<1) { //如果没找到,继续拆分
						String s=words.get(i).toString();
						for (int j = 0; j < s.length(); j++) {
							String value=String.valueOf(s.charAt(j));
							List<String> result1=tExplainMapper.getPinyinByzw(value);
							if(result1.size()>0) {//找到
								explain.add(result1.get(0));
							}else {//还没找到,就不找了
								explain.add(value);
							}
						}
					}else {//找到
						explain.add(result.get(0));
					}
				}
				return new  Result(true, "", explain);
			}
		}
		return new  Result(false, "");
	}
	@Override
	public Result addExplain(TExplain input) {
		int insert = tExplainMapper.insert(input);
		if(insert>0) {
			return new Result(true,"");
		}
		return new Result(false,"");
	}
}
