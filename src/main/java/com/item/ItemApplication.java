package com.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Spring boot application class
 * 
 * @author pxk3659
 *
 */
@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
//@EnableCircuitBreaker
public class ItemApplication {

	// extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

	// @Override
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder
	// builder) {
	// return builder.sources(RuleApplication.class);
	// }

}
