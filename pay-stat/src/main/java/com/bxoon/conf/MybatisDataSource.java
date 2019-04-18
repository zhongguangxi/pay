package com.bxoon.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(com.bxoon.conf.DataSourceProperties.class)
public class MybatisDataSource {

	@Autowired
	private com.bxoon.conf.DataSourceProperties config;

	@Bean
	public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(config.getDriverClassName());
        dataSourceBuilder.url(config.getUrl());
        dataSourceBuilder.username(config.getUsername());
        dataSourceBuilder.password(config.getPassword());
        return dataSourceBuilder.build();
	}
}
