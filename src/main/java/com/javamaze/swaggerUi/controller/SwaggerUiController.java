package com.javamaze.swaggerUi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javamaze.swaggerUi.service.SwaggerUiService;

@RestController
public class SwaggerUiController {
	
	@Autowired
	private SwaggerUiService swaggerUiService;
	
	@GetMapping(value = "/catfact")
	public String getCountryNameBasedOnPersonName() throws Exception {
		
		try {
		
			return swaggerUiService.getCatFact();
			
		} catch (Exception e) {
			throw new Exception(" Exception occurred while fetching country name ");
		}
		 
	}

}
