package com.sparta.springprepare;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordEncoderTest {

    @Autowired
    PasswordEncoder passwordEncoder;


    @Test
    @DisplayName("내가 만든 PasswordEncoder 구현 클래스 테스트")
    void test1() {
        String password = "Robbie's password";

        String encodePassword = passwordEncoder.encode(password);
        System.out.println("encodePassword = " + encodePassword);
    }
}