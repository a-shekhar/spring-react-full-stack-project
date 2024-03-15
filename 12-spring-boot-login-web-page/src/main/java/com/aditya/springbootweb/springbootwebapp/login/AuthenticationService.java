package com.aditya.springbootweb.springbootwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("Aditya");
        boolean isValidPassword = password.equalsIgnoreCase("aditya");
        return isValidPassword && isValidUserName;
    }
}
