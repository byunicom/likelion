package com.example.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    //이름을 기준으로 조회하고 싶어요. 어떻게 메서드를 정의하면 될까요?
//    List<User> findById(Long id);
    List<User> findByName(String name);
    List<User> findByEmail(String email);
    List<User> findByNameContaining(String name);   //selelct * from jpa_suer where name=?
    List<User> findByNameAndEmail(String name, String email);
    List<User> findByNameOrEmail(String name, String email);
}
