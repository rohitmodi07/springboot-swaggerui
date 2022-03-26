package com.javamaze.swaggerUi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
public class ApplicationConfig {
	
	@Value("${catfact_url}")
	private String backupUrl;
	
	@Bean
	public String backupUrl() {
		return this.backupUrl;
	}

}
