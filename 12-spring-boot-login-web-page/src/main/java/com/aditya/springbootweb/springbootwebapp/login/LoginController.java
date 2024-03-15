package com.aditya.springbootweb.springbootwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

@SessionAttributes(value = "name")
@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    // @Model from your controller to jsp
    public String gotoLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    // @Model from your controller to jsp
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        // Authentication
        // name - Aditya
        // password - aditya

        if(authenticationService.authenticate(name, password)){
            model.put("name", name);
            return "welcome";
        }

        model.put("errorMessage", "Invalid username or password");

        return "login";
    }
}
