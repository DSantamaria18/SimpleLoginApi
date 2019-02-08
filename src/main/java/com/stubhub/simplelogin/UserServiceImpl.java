package com.stubhub.simplelogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRespository userRespository;

    public Boolean validateLogin(Session session) {
        User user = userRespository.findByUsername(session.getUsername());
        return session.getPass().equals(user.getPass());
    }

    public User getUserByUsername(String username) {
        return userRespository.findByUsername(username);
    }
}
