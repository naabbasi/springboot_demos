package edu.learn.rest_demo.beans;

import lombok.Data;

@Data
public class UserCredential {
    private String username;
    private String email;

    public boolean isAnonymous() {
        return false;
    }
}
