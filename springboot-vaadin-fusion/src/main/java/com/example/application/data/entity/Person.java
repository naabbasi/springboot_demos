package com.example.application.data.entity;

import javax.persistence.Entity;

import com.example.application.data.AbstractEntity;
import java.time.LocalDate;
import javax.annotation.Nullable;

@Entity
public class Person extends AbstractEntity {

    private String firstName;
    private String lastName;
    @Nullable
    private LocalDate dob;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

}
