package ru.montana.spring.testoffrontandback.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // Указываем URL фронтенда
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Указываем методы, которые разрешены
                .allowedHeaders("*") // Разрешаем любые заголовки
                .allowCredentials(true); // Разрешаем отправку куки и авторизационных данных
    }
}
