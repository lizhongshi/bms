package com.dly.explain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
//@EnableScheduling
@MapperScan("com.dly.explain.dao")
public class ExplainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExplainApplication.class, args);
	}
}
