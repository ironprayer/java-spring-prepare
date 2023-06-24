package com.sparta.springprepare.response;

import lombok.Setter;

//@Getter
@Setter
public class Star {
    public String name;
    public int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {}
}