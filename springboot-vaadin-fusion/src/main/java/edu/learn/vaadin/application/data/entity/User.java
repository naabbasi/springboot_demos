package edu.learn.vaadin.application.data.entity;

import javax.persistence.Entity;

import edu.learn.vaadin.application.data.generic.AbstractEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Data
@ToString(exclude = {"password"})
@Entity
public class User extends AbstractEntity {

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        super();
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
