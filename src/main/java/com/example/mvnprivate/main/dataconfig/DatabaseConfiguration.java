package com.example.mvnprivate.main.dataconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DatabaseConfiguration {

    @Bean
    @ConfigurationProperties()
    public DataSource dataSource(){

        return DataSourceBuilder.create().build();
    }
}
