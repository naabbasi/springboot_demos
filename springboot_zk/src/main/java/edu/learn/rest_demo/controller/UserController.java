package edu.learn.rest_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.learn.rest_demo.entities.User;
import edu.learn.rest_demo.repos.UserRepo;

@RequestMapping("/api/users")
@RestController
class UserController {
    @Autowired
    private UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping(path = "/")
    public Iterable<User> users() {
        return this.userRepo.findAll();
    }
}
