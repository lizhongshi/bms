//package com.dly.config;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//@Configuration
//@EnableTransactionManagement
//
//public class MyDataSourceTransactionManagerAutoConfiguration  extends DataSourceTransactionManagerAutoConfiguration {
//	@Bean(name = "transactionManager")
//    public DataSourceTransactionManager transactionManagers() {
//		ApplicationContext app= 
//      
//        return new DataSourceTransactionManager(SpringContextHolder.getBean("roundRobinDataSouceProxy"));
//    }
//}
