package com.apandiyan;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "test-service")
public class ProductProperties {

	private final Map<String, String> products = new HashMap<>();
	
	public Map<String, String> getProducts() {
		return products;
	}
	
}
