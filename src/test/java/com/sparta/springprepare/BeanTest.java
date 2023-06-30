package com.sparta.springprepare;

import com.sparta.springprepare.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("chicken")
    Food food;

    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확면")
    void test1(){
        food.eat();
    }
}
