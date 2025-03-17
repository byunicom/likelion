package com.example.beforsecurity;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
//@Component
//@WebFilter(urlPatterns = "/test/*")
public class CaramiFilter implements Filter {

    @Override
    public void init(jakarta.servlet.FilterConfig filterConfig) throws ServletException {
        log.info("CaramiFilter init()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("CaramiFilter doFilter() 실행 전!!");
        filterChain.doFilter(servletRequest,servletResponse);   //필수 코드
        log.info("CaramiFilter doFilter() 실행 후!!");
    }

    @Override
    public void destroy() {
        log.info("CaramiFilter destroy()");
    }
}
