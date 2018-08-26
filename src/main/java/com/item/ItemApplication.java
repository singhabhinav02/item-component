package com.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring boot application class
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
