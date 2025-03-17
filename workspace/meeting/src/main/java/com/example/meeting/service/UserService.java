package com.example.meeting.service;

import com.example.meeting.entity.User;
import com.example.meeting.repository.UserRepository;
import com.example.meeting.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final JwtUtil jWtUtil;

    //회원가입  register
    //회원가입은 id, password 를 받아서 DB에 저장하고, 리턴
    @Transactional
    public String register(String email, String password){
        //저 이메일이 이미 존재하는지 체크
        //존재한다면?? "이미 존재하는 아이디" 라고 리턴
        if(userRepository.findByEmail(email).isPresent()){
            return "이미 존재하는 아이디입니다.";
        }

        //존재하지 않는다면??
        //엔티티를 생성해서, 엔티티에 이메일, 패스워드값을 넣고,
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        //userRepository에게 부탁해서 저장.
        userRepository.save(user);

        //return 으로 "회원 가입성공"
        return "회원 가입성공";
    }

//    @Transactional
//    public String updateRegister(String email, String password){
//
//        if(userRepository.findByEmail(email).isEmpty()){
//           return "존재하지 않는 아이디입니다.";
//        }
//
//        User updateUser = new User();
////        updateUser.setEmail(email);
//        updateUser.setPassword(password);
//
//        userRepository.save(updateUser);
//        return "비밀번호 변경 성공!!";
//
//    }

    //로그인   login

    //로그아웃  logout
}
