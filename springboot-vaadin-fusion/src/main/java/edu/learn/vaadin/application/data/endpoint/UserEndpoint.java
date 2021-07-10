package edu.learn.vaadin.application.data.endpoint;

import edu.learn.vaadin.application.data.generic.CrudEndpoint;
import edu.learn.vaadin.application.data.entity.User;
import edu.learn.vaadin.application.data.service.UserService;
import com.vaadin.flow.server.connect.Endpoint;

import org.springframework.beans.factory.annotation.Autowired;

@Endpoint
public class UserEndpoint extends CrudEndpoint<User, Integer> {

    private UserService service;

    public UserEndpoint(@Autowired UserService service) {
        this.service = service;
    }

    @Override
    protected UserService getService() {
        return service;
    }

}
