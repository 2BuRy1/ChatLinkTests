package ru.montana.spring.testoffrontandback.service;


import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfigSecurity {




    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.httpBasic().disable();
        http.formLogin().disable();
        http.csrf().disable().cors().and().authorizeRequests().requestMatchers("auth/login", "login").permitAll();
        return http.build();
    }
}
