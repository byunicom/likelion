package com.example.meeting.service;

import com.example.meeting.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTestWithMock {
    @Mock
    private UserRepository userRepository;  //가짜객체.

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this); //Mockito 초기화
    }

    @Test
    @DisplayName("회원가입 - 성공")
    void register_success(){
        String email = "test@exam.com";
        String password="pass123";

        //시나리오 생성. 이메일을 찾아서 존재하면 empty 를 반환.
        when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

        String response = userService.register(email,password);

        assertEquals("회원가입 성공!!.",response);
//        verify(userRepository.times)

    }
}
