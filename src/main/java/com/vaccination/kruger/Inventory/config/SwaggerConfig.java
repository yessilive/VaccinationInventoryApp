package com.vaccination.kruger.Inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration


public class SwaggerConfig {
	
	ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title(" Vaccination Inventory App")
            .description("Check the status of the employees vaccinated")
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", "lachina_58@hotmail.com"))
            .build();
    }

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.vaccination.kruger.Inventory"))
				.build()
                .apiInfo(apiInfo());
    }

}

