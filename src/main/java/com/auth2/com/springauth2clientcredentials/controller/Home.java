package com.auth2.com.springauth2clientcredentials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class Home {

    @GetMapping("/validateUser")
    public Principal user(Principal user) {
        return user;
    }
}
