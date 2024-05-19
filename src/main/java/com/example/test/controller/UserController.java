package com.example.test.controller;

import com.example.test.model.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    private final String className = UserController.class.getSimpleName();

    @GetMapping("getEmptyComstructorUser")
    public User getUser1() {
        String methodName = className + "/getUser1()";
        Object[] params = new Object[]{methodName};
        log.info("{}", params);
        User user = new User();
        user.setName("Ibrahim1");
        user.setEmail("ibrahim1@gmail.com");
        params = new Object[]{methodName, user.getName(), user.getEmail()};
        log.info("{}, with User Name: {}, and Email: {}", params);
        return user;
    }

    @GetMapping("getAllArgsComstructorUser")
    public User getUser2() {
        return new User("Ibrahim2", "ibrahim2@gmail.com");
    }

    @GetMapping("getBuilderUser")
    public User getUser3() {
        String methodName = className + "/getUser3()";

        User user = User.builder().name("Ibrahim").email("ibrahim@gmail.com").build();

        Object[] params = new Object[]{methodName, user.getName(), user.getEmail()};
        log.info("{}, User Name: {}, and User Email: {}", params);
        return user;
    }




}
