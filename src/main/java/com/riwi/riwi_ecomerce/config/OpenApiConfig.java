package com.riwi.riwi_ecomerce.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Api para administración de Ecommerce", version = "1.0", description = "Esta api fue creada para Riwi con los fundamentos de spring boot y spring jpa"))
public class OpenApiConfig {
    
}