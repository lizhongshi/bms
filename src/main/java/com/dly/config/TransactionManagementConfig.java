package com.dly.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class TransactionManagementConfig  {
 
    @Bean
    public PlatformTransactionManager mysqlTransactionManager(@Qualifier("dataSource") DataSource myqlDataSource)
    {
        return new DataSourceTransactionManager(myqlDataSource);
    }
}