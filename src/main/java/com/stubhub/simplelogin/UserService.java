package com.stubhub.simplelogin;

import org.springframework.stereotype.Service;

public interface UserService {
    public Boolean validateLogin(Session session);

    public User getUserByUsername(String username);
}


