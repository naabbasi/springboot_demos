package edu.learn.rest_demo.service;

import edu.learn.rest_demo.entities.User;
import edu.learn.rest_demo.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
@Scope(proxyMode= ScopedProxyMode.TARGET_CLASS)
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Iterable<User> allUsers() {
        return List.of(new User("nabbasi", "x"));
    }

    public User findUser(String username) {
        return this.userRepo.findByUsername(username);
    }
}
