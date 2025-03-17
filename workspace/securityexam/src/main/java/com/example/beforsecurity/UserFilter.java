package com.example.beforsecurity;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
@Order(1)
public class UserFilter implements Filter {

//    @Override
//    public void init(jakarta.servlet.FilterConfig filterConfig) throws ServletException {
//        log.info("UserFilter init()");
//    }
//
//    @Override
//    public void destroy() {
//        log.info("UserFilter destroy()");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        log.info("UserFilter doFileter 실행전!!");
//        filterChain.doFilter(servletRequest,servletResponse);   //필수 코드
//        log.info("UserFilter doFileter 실행후!!");
//    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            log.info("UserFilter doFilter 실행 전!!"+Thread.currentThread().getName());

            //스레드 로컬에 저장하고 싶은 객체가 존재한다면?
            UserContext.setUser(new User("carami"));

            filterChain.doFilter(servletRequest, servletResponse);

            log.info("UserFilter doFilter 실행 후 !!"+Thread.currentThread().getName());
        }finally {
            UserContext.clear();
        }
    }
}
