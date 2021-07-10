package edu.learn.vaadin.application;

import edu.learn.vaadin.application.data.entity.User;
import edu.learn.vaadin.application.data.service.UserService;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

import com.vaadin.flow.theme.material.Material;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.vaadin.artur.helpers.LaunchUtil;
import com.vaadin.flow.theme.Theme;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@Theme(value = "springboot-vaadin-fusion", variant = Material.DARK)
@PWA(name = "springboot-vaadin-fusion", shortName = "springboot-vaadin-fusion", offlineResources = {"images/logo.png"})
public class Application extends SpringBootServletInitializer implements AppShellConfigurator {

    @Bean
    public CommandLineRunner sampleData(UserService userService) {
        return args -> {
            userService.update(new User("nabbasi", "x", "Noman Ali", "Abbasi"));
            userService.update(new User("fabbasi", "x", "Farhan Ali", "Abbasi"));
            userService.update(new User("aabbasi", "x", "Arsalan Ali", "Abbasi"));
        };
    }

    public static void main(String[] args) {
        LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class, args));
    }

}
