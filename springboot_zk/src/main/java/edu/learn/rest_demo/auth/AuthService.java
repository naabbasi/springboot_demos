package edu.learn.rest_demo.auth;

import edu.learn.rest_demo.beans.UserCredential;
import edu.learn.rest_demo.entities.User;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

public interface AuthService {
    boolean login(String username, String password);
    void logout();

    default User getUserCredential() {
        Session sess = Sessions.getCurrent();
        User cre = (User) sess.getAttribute("loggedIn");

        if (cre == null) {
            cre = new User();//new a anonymous user and set to session
            cre.setUsername("nabbasi");
            //sess.setAttribute("userCredential", cre);
        }
        return cre;
    }
}
