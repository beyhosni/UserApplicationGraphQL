package com.User.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.User.dto.CreateUserDTO;
import com.User.model.User;
import com.User.service.UserService;

@Controller
public class UserGraphQLController {

    @Autowired
    private UserService userService;

    @QueryMapping
    public User getUser(@Argument Long id) {
        return userService.getUser(id);
    }

    @QueryMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @MutationMapping
    public User createUser(@Argument CreateUserDTO userDto) {
        return userService.createUser(userDto);
    }

    @MutationMapping
    public Boolean deleteUser(@Argument Long id) {
        return userService.deleteUser(id);
    }
}

