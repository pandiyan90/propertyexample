package com.apandiyan;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@TestPropertySource("classpath:products.yaml")
@EnableConfigurationProperties(ProductProperties.class)
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
public class ProductYamlTest {
	
	@Autowired
	private ProductProperties productProperties;
	
	@Test
	public void test() {
		System.out.println("productProperties: "+productProperties);
		System.out.println(3+"--"+productProperties.getProducts().size());
		assertEquals(3, productProperties.getProducts().size());
	}

}
