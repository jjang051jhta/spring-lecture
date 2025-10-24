package com.jjang051.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth ->
                auth
                    .requestMatchers(
                                    "/",
                                    "/main",
                                    "/index",
                                    "/member/signup",
                                    "/member/login",
                                    "/css/**","/js/**").permitAll()
                    .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.disable())
                .formLogin(form ->
                                form.loginPage("/member/login")
                                    .loginProcessingUrl("/member/login")
                                    .defaultSuccessUrl("/",true)
                                    .usernameParameter("userID")  //username
                                    .passwordParameter("userPW")  //password
                                    .failureUrl("/login?error=true")
                                    .permitAll()
                )
                .logout(logout ->
                        logout.logoutUrl("/logout")
                              .logoutSuccessUrl("/"));
                return http.build();
    };
}
