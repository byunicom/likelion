package com.example.meeting.controller;

import com.example.meeting.dto.RegisterRequestDto;
import com.example.meeting.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "인증 관련 API")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @PostMapping("/register")
    public String register(@ModelAttribute RegisterRequestDto requestDto){
        String message =  userService.register(requestDto.getEmail(), requestDto.getPassword());
        System.out.println("통신성공");
        System.out.println(">>>"+message);

//        return ResponseEntity.ok(message);
        return "redirect:/";
    }

    @GetMapping("/register")
    public ModelAndView register() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");

        return modelAndView;
    }

//    @GetMapping("/register/{message}")
//    public ModelAndView registerResult(@RequestBody RegisterRequestDto requestDto) throws IOException{
//        String message =  userService.register(requestDto.getEmail(), requestDto.getPassword());
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("registerResult");
//        modelAndView.addObject("message",message);
//
//        return modelAndView;
//    }
}
