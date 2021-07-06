package edu.learn.rest_demo;

import edu.learn.rest_demo.beans.SimpleBean;
import edu.learn.rest_demo.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import edu.learn.rest_demo.repos.UserRepo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableJpaRepositories
@ComponentScan(basePackages = {
		"edu.learn.rest_demo.controller", "edu.learn.rest_demo.ui.controller", "edu.learn.rest_demo.ui.model",
		"edu.learn.rest_demo.service", "edu.learn.rest_demo.repos", "edu.learn.rest_demo.auth", "edu.learn.rest_demo.entities"
})
@SpringBootApplication
public class SpringbootRestApplication {

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean("Hello from a simple bean");
	}

	@Bean
	public CommandLineRunner execute(UserRepo userRepo) {
		return args -> {
			userRepo.save(new User("nabbasi", "x"));
			userRepo.save(new User("fabbasi", "x"));
			log.info("I have started before application");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApplication.class, args);
	}

}
