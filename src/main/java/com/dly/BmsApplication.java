package com.dly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@MapperScan("com.dly.dao")
@EnableTransactionManagement
public class BmsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BmsApplication.class, args);
	}
	
}
