package com.market.user.service8002.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "hello thymeleaf");
        return "home";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {
        model.addAttribute("welcome", username);
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
