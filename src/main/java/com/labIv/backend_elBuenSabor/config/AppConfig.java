package com.labIv.backend_elBuenSabor.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OpenAPI buenSaborBackendOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API Trabajo Final - Proyecto El Buen Sabor")
                        .description("<h4>API que provee de todas las funcionalidades necesarias para el Backend de El Buen Sabor</h4>")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Esteban Gallar")
                                .url("https://github.com/EstebanKT89")
                                .email("Esteban_2189@hotmail.com")));
    }

}
