package com.sparta.springprepare.jwt.controller;

import com.sparta.springprepare.jwt.entity.Users;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(HttpServletRequest req) {
        System.out.println("ProductController.getProducts : 인증 완료");
        Users user = (Users) req.getAttribute("user");
        System.out.println("user.getUsername() = " + user.getUsername());

        return "redirect:/";
    }
}