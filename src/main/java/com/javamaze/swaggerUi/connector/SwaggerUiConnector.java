package com.javamaze.swaggerUi.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class SwaggerUiConnector {

	private RestTemplate restTemplate = new RestTemplate();
	private String backupUrl;
	
	@Autowired
	public SwaggerUiConnector(String backupUrl) {
		this.backupUrl = backupUrl;
	}
	
	public String getCatFact() {
		return restTemplate.getForObject(backupUrl, String.class);
	}
	
}
