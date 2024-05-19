package com.example.test.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
public class User {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        log.info("User created");
    }

    public User() {
        log.info("I am in the empty constructor");
    }
}
