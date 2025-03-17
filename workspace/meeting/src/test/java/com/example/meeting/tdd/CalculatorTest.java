package com.example.meeting.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
        System.out.println("각 테스트 메서드가 실행되기 전에 실행.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("각 테스트 메서드가 실행된 후 실행.");
    }

    @Test
    void add() {
        System.out.println("add test 메서드 실행");
    }

    @Test
    void test(){
        System.out.println("test test 메서드 실행");
    }
}