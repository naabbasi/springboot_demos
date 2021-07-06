package edu.learn.rest_demo.repos;

import edu.learn.rest_demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

    User findByUsername(String username);
    User findByUsernameAndAndPassword(String username, String password);
}
