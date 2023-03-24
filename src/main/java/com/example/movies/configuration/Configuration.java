package com.example.movies.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {
//es necesario tener un archivo de configuracion para poder gestionar la clase RestTemplate que realiza solicitudes a APIs externas
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
