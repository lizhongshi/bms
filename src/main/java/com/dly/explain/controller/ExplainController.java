package com.dly.explain.controller;





import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dly.explain.base.Result;
import com.dly.explain.dao.TExplain12Mapper;
import com.dly.explain.dao.TExplain3Mapper;
import com.dly.explain.dao.TExplain6Mapper;
import com.dly.explain.dao.TExplainMapper;
import com.dly.explain.entity.TExplain;
import com.dly.explain.entity.TExplain6;
import com.dly.explain.service.ExplainService;

@RestController
@RequestMapping("api/explain")
public class ExplainController {
	@Resource
	ExplainService  explainService;
	@Resource
	TExplain6Mapper tExplain6Mapper;
	@Resource
	TExplain3Mapper tExplain3Mapper;
	@Resource
	TExplain12Mapper tExplain12Mapper;
	
	@Resource
	TExplainMapper  tExplainMapper;
	@GetMapping(value="",produces = "application/json;charset=UTF-8")
	public  Result explain(String str,String type)  {
		return explainService.explain(str, type);
		
	}
	@PostMapping(value="",produces = "application/json;charset=UTF-8")
	public Result addExplain( TExplain input) {
		return	explainService.addExplain(input);
	}
	@GetMapping("t")
	public  void  test() throws IOException {
		File f=new File("C:\\Users\\12622\\Desktop\\t2.txt");
		Reader reader;
		try {
			reader = new FileReader(f);
			BufferedReader br=new BufferedReader(reader);
			String line = null;
	        while ((line = br.readLine()) != null) {
	        	StringBuffer b1=new StringBuffer();
	        	StringBuffer b2=new StringBuffer();
	        	for (int i = 0; i < line.length(); i++) {
	        		
	        		String text=line.substring(i, i+1);
	        		 String regex = "^[\\u4e00-\\u9fa5]*$";  
	        		Matcher m = Pattern.compile(regex).matcher(text); 
	        		if(m.find()) {//是汉字
	        			b1.append(text);
	        		}else {//是英文
	        			b2.append(text);
	        		}
				}
	        	System.out.println();
	        	TExplain p=new TExplain();
	        	p.setPinyin(b2.toString());
	        	p.setZw(b1.toString());
	        	tExplainMapper.insert(p);
	        	
	            //System.out.println(line.length());
	        }
	       // System.out.println("内容为："+ new String(c,0,len));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        String input = "嗄";
        String regex = "^[\\u4e00-\\u9fa5]*$";  
        Matcher m = Pattern.compile(regex).matcher(input);  
//        System.out.println(m.find());  
        //sc.close();  
	}
	@GetMapping("t1")
	public  void  test1() throws IOException {
		File f=new File("C:\\Users\\12622\\Desktop\\tttt.txt");
		Reader reader;
		try {
			reader = new FileReader(f);
			BufferedReader br=new BufferedReader(reader);
			String line = null;
	        while ((line = br.readLine()) != null) {
	        ///=	line.substring(0, 1);
	        	if(line.length()>1) {
	        		String sd= line.trim();
	        		
	        		String input = sd.substring(0, 1);
	        		String regex = "^[\\u4e00-\\u9fa5]*$";  
	        		Matcher m = Pattern.compile(regex).matcher(input);  
	        		if(m.find()) {
	        			StringBuffer b1=new StringBuffer();
	    	        	StringBuffer b2=new StringBuffer();
	    	        	for (int i = 0; i < sd.length(); i++) {
	    	        		
	    	        		String text=sd.substring(i, i+1);
	    	        		m = Pattern.compile(regex).matcher(text);
	    	        		if(m.find()) {//是汉字
	    	        			b1.append(text);
	    	        		}else {//是英文
	    	        			regex="\\s+";
	    	        			m = Pattern.compile(regex).matcher(text);  
	    	        			if(!m.find()) {
	    	        				
	    	        				b2.append(text);
	    	        			}
	    	        		}
	    	        		
	    				}
	    	        	System.out.println(b1);
	    	        	System.out.println(b2);
	    	        	TExplain6 t6=new TExplain6();
	    	        	t6.setPinyin(b2.toString());
	    	        	t6.setZw(b1.toString());
	    	        	
	    	        	tExplain6Mapper.insert(t6);
	        		}
	        	}
	        	
	        }
	       // System.out.println("内容为："+ new String(c,0,len));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//        String input = "嗄";
//        String regex = "^[\\u4e00-\\u9fa5]*$";  
//        Matcher m = Pattern.compile(regex).matcher(input);  
//        System.out.println(m.find());  
        //sc.close();  
	}
	
	
}
