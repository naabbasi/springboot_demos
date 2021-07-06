package edu.learn.springboot_jqxwidgets.repos;

import edu.learn.springboot_jqxwidgets.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

    User findByUsername(String username);
    User findByUsernameAndAndPassword(String username, String password);
}
