package com.toov5.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

//DataSource01数据源的读取
@Configuration // 注册到springboot容器中  
@MapperScan(basePackages = "com.toov5.test01", sqlSessionFactoryRef = "test1SqlSessionFactory") 
//指向了下面的名为 test1SqlSessionFactory 的工厂
public class DataSource1Config {

	@Bean(name = "test1DataSource")  //表示注入到Spring 容器中去
	@ConfigurationProperties(prefix = "spring.datasource.test1")  //表以此为开头，去properties去读 （ 后面是写死的）
	@Primary
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}

	
	@Bean(name = "test1SqlSessionFactory") // 
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		// bean.setMapperLocations(
		// new
		// PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
		// 如果有一些mapper文件的话 可以把上面的注解放开
		return bean.getObject();
	}

	
	@Bean(name = "test1TransactionManager")  //配置事务
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "test1SqlSessionTemplate")
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}







