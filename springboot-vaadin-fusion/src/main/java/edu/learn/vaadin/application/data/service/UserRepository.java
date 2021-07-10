package edu.learn.vaadin.application.data.service;

import edu.learn.vaadin.application.data.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
