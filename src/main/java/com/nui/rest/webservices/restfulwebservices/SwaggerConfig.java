package com.nui.rest.webservices.restfulwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Contact;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configuration
//Enable Swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private static final springfox.documentation.service.Contact DEFAULT_CONTACT = new springfox.documentation.service.Contact("","", "");
	private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Api", "documentation", "1.0", "urn:tos", DEFAULT_CONTACT, "", "");;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO);
	}
	
	//Bean - Docket
	//Swagger 2
	//All the paths
	//All the apis
}
