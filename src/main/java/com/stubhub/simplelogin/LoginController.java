package com.stubhub.simplelogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login/")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/", consumes = "application/json")
    public User getUserInfo(@RequestBody Session session) throws Exception{
        String username = session.getUsername();
        Boolean authOk = userService.validateLogin(session);
        if(authOk){
            return userService.getUserByUsername(username);
        } else {
            throw new Exception("Login incorrect!!!");
        }
    }



}
