package edu.learn.rest_demo.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersRoutes {
    @GetMapping("/index")
    public String index() {
        return "zul/index";
    }

    @GetMapping("/bean")
    public String bean() {
        return "zul/bean";
    }

    @GetMapping("/home")
    public String home() {
        return "zul/home";
    }

    @GetMapping("/login")
    public String login() {
        return "zul/login";
    }
}
