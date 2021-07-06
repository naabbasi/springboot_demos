package edu.learn.rest_demo.auth;

import edu.learn.rest_demo.beans.UserCredential;
import edu.learn.rest_demo.entities.User;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.util.Initiator;

import java.util.Map;

public class AuthenticationInit implements Initiator {

    //services
    AuthService authService = new AuthenticationServiceImpl();

    public void doInit(Page page, Map<String, Object> args) throws Exception {

        User cre = authService.getUserCredential();
        if(cre==null){
            Executions.sendRedirect("/login");
            return;
        }
    }
}
