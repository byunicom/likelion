package com.example.securityexam;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        //1. 기본 설정
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().authenticated() //모든 요청에 대해서 인증을 요구하겠다.
//                )
//                .formLogin(Customizer.withDefaults());


//      2. 추가로. 원하는 페이지는 인증없이 접근 가능.   폼 로그인 인증 방식을 사용자가 원하는 설정으로..
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/hello","/loginForm").permitAll() //인증없이 접근 가능
                        .anyRequest().authenticated() //모든 요청에 대해서 인증을 요구하겠다.
                )
                .formLogin(formLoin -> formLoin
                        .loginPage("/loginForm")  //원하는 로그인 페이지 설정
                        .defaultSuccessUrl("/success") //인증에 성공하면 가고싶은 페이지 설정
                        .failureUrl("/fail")//실패했다면??
                        .usernameParameter("userId")
                        .passwordParameter("password")
                );

        return http.build();
    }
}
