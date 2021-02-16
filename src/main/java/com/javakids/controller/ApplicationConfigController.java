/**
 * 
 */
package com.javakids.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ab68478
 *
 */
@RestController
public class ApplicationConfigController {
	
	@Value("${db.url}")
	private String dbUrl;
	
	@GetMapping("/config")
	public String getDbUrl() {

		return dbUrl;

	}

}
