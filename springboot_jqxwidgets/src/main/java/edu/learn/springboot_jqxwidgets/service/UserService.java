package edu.learn.springboot_jqxwidgets.service;

import edu.learn.springboot_jqxwidgets.entities.User;
import edu.learn.springboot_jqxwidgets.repos.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserService {

    private final UserRepo userRepo;

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
