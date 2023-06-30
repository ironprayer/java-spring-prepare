package com.sparta.springprepare.food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Pizza implements Food {
    @Override
    @Primary
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}