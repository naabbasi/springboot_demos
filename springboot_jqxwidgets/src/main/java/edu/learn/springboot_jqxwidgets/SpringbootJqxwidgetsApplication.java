package edu.learn.springboot_jqxwidgets;

import edu.learn.springboot_jqxwidgets.entities.User;
import edu.learn.springboot_jqxwidgets.repos.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication(scanBasePackages = {"edu.learn.springboot_jqxwidgets"})
public class SpringbootJqxwidgetsApplication {

    @Bean
    public CommandLineRunner execute(UserRepo userRepo) {
        return args -> {
            userRepo.save(new User("nabbasi", "x"));
            userRepo.save(new User("fabbasi", "x"));
            log.info("I have started before application");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJqxwidgetsApplication.class, args);
    }

}
