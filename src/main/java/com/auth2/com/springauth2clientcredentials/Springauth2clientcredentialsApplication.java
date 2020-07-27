package com.auth2.com.springauth2clientcredentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@SpringBootApplication
@EnableResourceServer
public class Springauth2clientcredentialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springauth2clientcredentialsApplication.class, args);
    }



}
