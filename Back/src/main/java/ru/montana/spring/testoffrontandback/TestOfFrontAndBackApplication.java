package ru.montana.spring.testoffrontandback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class TestOfFrontAndBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestOfFrontAndBackApplication.class, args);
    }



//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.csrf().disable().cors().and().authorizeRequests().requestMatchers("auth/login", "login").permitAll();
//        return http.build();
//    }
}
