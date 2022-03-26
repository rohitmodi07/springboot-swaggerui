package com.javamaze.swaggerUi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamaze.swaggerUi.connector.SwaggerUiConnector;


@Service
public class SwaggerUiService {
	
	private SwaggerUiConnector swaggerUiConnector ;
	
	@Autowired
	public SwaggerUiService(SwaggerUiConnector swaggerUiConnector) {
		this.swaggerUiConnector = swaggerUiConnector;
	}
	
	public String getCatFact() throws Exception {
		return swaggerUiConnector.getCatFact();
	}

}
