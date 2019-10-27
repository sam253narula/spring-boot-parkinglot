package com.springboot.parkinglot.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Parking-api").select()
				.apis(RequestHandlerSelectors.basePackage(
						"com.springboot.parkinglot.example.controller"))
				.build();
		
	}
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Bakery-api").apiInfo(apiInfo()).select()
		.apis(RequestHandlerSelectors.basePackage(
				"com.springboot.parkinglot.example.BakeryController"))
		.build();
				
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Bakery Shop API")
				.description("Bakery Shop API reference for developers")
				.termsOfServiceUrl("http://BakeryShop.com")
				.contact(new Contact("Bakery Shop", "http://BakeryShop.com", "bakeryshop@gmail.com")).license("Bakery Shop License")
				.licenseUrl("bakeryshop@gmail.com").version("1.0").build();
	}

}
