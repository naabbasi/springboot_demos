package edu.learn.rest_demo.auth;

import edu.learn.rest_demo.entities.User;
import edu.learn.rest_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.WireVariable;

@Component
public class AuthenticationServiceImpl implements AuthService {

    @WireVariable
    private UserService userService;

    @Override
    public boolean login(String username, String password) {
        Session session = Sessions.getCurrent();
        var user = new User();
        user.setUsername(username);
        user.setPassword(password);
        session.setAttribute("loggedIn", user);
        return user != null;
    }

    @Override
    public void logout() {
        Session session = Sessions.getCurrent();
        session.removeAttribute("loggedIn");
    }
}
