package com.collaboration.java.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;


@Configuration
@EnableWebMvc
@PropertySource("classpath:application.properties")
public class WebAppConfig {

    private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";
    
 
   
	@Resource
	private Environment env;

	@Bean(name="datasource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:8889/COLLABORATION");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean(name="sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory() throws Exception
	{
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
	      sqlSessionFactory.setDataSource(dataSource());
			return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() throws Exception
	{
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage("com.collaboration.java.ibatis.mapper");
		configurer.setSqlSessionFactory(sqlSessionFactory());
		return configurer;
	}
	

}

