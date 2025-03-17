package com.example.oauthexam.security;

import com.example.jwtexam.service.UserService;
import com.example.oauthexam.service.SocialLoginInfoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class CustomOAuth2AuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private final UserService userService;
    private final SocialLoginInfoService socialLoginInfoService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //요청정보로부터 provider 얻어온다.
        //redirect-uri : "/login/oauth2/code/{registrationId}
        String requestURI = request.getRequestURI();
        String provider = extractProviderFromUri(requestURI);

        //provider가 없는 경로가 요청되었다고 하는 것은... 문제가 발생할 것!!
        if(provider==null){
            response.sendRedirect("/");
            return;
        }

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    }

    private String extractProviderFromUri(String uri) {
        //localhost:8080/login/oauth2/code/github
        if(uri == null || uri.isBlank()) {
            return null;
        }

        if(!uri.startsWith("/login/oauth2/code/")){
            return null;
        }

        // 예: /login/oauth2/code/github -> github
        String[] segments = uri.split("/");
        return segments[segments.length - 1];
    }
}
