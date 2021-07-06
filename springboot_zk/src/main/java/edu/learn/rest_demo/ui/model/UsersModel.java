package edu.learn.rest_demo.ui.model;

import edu.learn.rest_demo.auth.AuthService;
import edu.learn.rest_demo.auth.AuthenticationServiceImpl;
import edu.learn.rest_demo.entities.User;
import edu.learn.rest_demo.repos.UserRepo;
import edu.learn.rest_demo.service.UserService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.WireVariable;

@Data
@NoArgsConstructor
public class UsersModel {
    @WireVariable
    private UserService userService;

    @WireVariable
    private UserRepo userRepo;
    private String username;
    private String password;

    @Command
    public void checkLogin() {
        System.out.println("Check user is authenticated");
        Session session = Sessions.getCurrent();
        if(session.getAttribute("loggedIn") != null) {
            Executions.sendRedirect("/home");
        }
    }

    @NotifyChange({"selected", "orders"})
    @Command
    public void loginUser() {
        //manipulate data
        System.out.println(this.username);
        System.out.println(this.password);
        System.out.println(this.userService.allUsers());
        System.out.println(this.userRepo.findByUsername(this.username));

        AuthService authService = new AuthenticationServiceImpl();
        authService.login(this.username, this.password);
        Executions.sendRedirect("/home");
    }
}
