package com.chan.chan1.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping("/join")
    public String join(){

        return "user/joinForm";
    }

    @PostMapping("/login")
    public String login(){

        return "user/loginForm";
    }

}
