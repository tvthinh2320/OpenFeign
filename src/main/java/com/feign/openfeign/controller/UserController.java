package com.feign.openfeign.controller;

import com.feign.openfeign.dto.Example;
import com.feign.openfeign.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<Example> getAllUsers(){
        return userServices.getAllUsers();
    }

//    @GetMapping
//    public Example getUserById(@PathVariable Long userId){
//        return userServices.getUserById(userId);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Example createUser(Example example) {
        return userServices.create(example);
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@PathVariable Long userId, Example user) {
        userServices.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Long userId) { userServices.deleteUser(userId); }
}
