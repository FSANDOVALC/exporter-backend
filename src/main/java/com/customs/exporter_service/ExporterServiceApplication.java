package com.customs.exporter_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.customs.exporter_service.model")
@EnableJpaRepositories("com.customs.exporter_service.repository")
public class ExporterServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExporterServiceApplication.class, args);
	}

	@Bean
	public io.swagger.v3.oas.models.OpenAPI customOpenAPI() {
		return new io.swagger.v3.oas.models.OpenAPI()
				.info(new io.swagger.v3.oas.models.info.Info()
						.title("Exporter Service API")
						.version("1.0.0")
						.description("API Documentation for Exporter Service"));
	}
}
