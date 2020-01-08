package com.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.rest.controller")
public class MvcApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MvcApplication.class)
		.run(args);

	}

}
