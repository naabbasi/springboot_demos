package edu.learn.vaadin.application.data.generator;

import com.github.javafaker.Faker;
import com.vaadin.flow.spring.annotation.SpringComponent;
import edu.learn.vaadin.application.data.entity.User;
import edu.learn.vaadin.application.data.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringComponent
public class DataGenerator  {

    @Bean
    public CommandLineRunner generate(UserService userService) {
        return args -> {
            this.generateUserData(userService);
        };
    }

    private boolean generateUserData(UserService userService) {
        Faker faker = new Faker();
        for(var i = 0 ; i < 500; i++) {
            userService.update(new User(faker.name().username(), "x", faker.name().firstName(), faker.name().lastName()));
        }

        return true;
    }
}
