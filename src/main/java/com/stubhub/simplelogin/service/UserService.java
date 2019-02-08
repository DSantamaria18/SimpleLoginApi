package com.stubhub.simplelogin.service;

import com.stubhub.simplelogin.domain.Session;
import com.stubhub.simplelogin.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {
    public Boolean validateLogin(Session session);

    public User getUserByUsername(String username);
}


