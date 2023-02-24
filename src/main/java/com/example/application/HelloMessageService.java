package com.example.application;

import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;

@Service
public class HelloMessageService {

    @RolesAllowed("USER")
    public String prepareMessage(String value) {
        return "Hello  " + value;
    }
}
