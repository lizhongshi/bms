package com.dly.explain.controller;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("api/test")
public class Test {
	//@GetMapping("t")
	@RequestMapping("t")
	public Object t(HttpServletRequest req) {
		System.out.println(req.getAuthType());
		return req;
	}
//	@Scheduled(cron = "0/10 * * * * *")  
//	public void timer(){  
//	    //获取当前时间  
//	    LocalDateTime localDateTime =LocalDateTime.now();  
//	    System.out.println("当前时间为:" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));  
//	    
//	}  
}
