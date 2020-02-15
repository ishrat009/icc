package com.icc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.icc.config.HibernateConfig;

@Configuration
@ComponentScan(basePackages = { "com.icc.service" })
public class RootConfig {

	@Bean
	GlobalExceptionHandler globalExceptionHandler() {
		return new GlobalExceptionHandler();
	}

	@Bean
	HibernateConfig hibernateConfig() {
		return new HibernateConfig();
	}
}