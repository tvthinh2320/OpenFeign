package com.feign.openfeign.client;

import com.feign.openfeign.dto.Example;
import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(
        url="https://jsonplaceholder.typicode.com",
        name="USER-CLIENT")
public interface UserClient {

    @GetMapping("/users")
    List<Example> getUsers();

//    @PostMapping(value= "/users" ,consumes = MediaType.APPLICATION_JSON_VALUE)
//    @Headers("Content-Type: application/json")
    @Headers("Content-Type: application/json")
    @PostMapping("/users")
    Example createUser(Example example);

    @GetMapping("/users/{userId}")
    Example getUserById(@PathVariable Long userId);

    @PutMapping("/users/")
    Example updateUser(Example user);

    @DeleteMapping("/users/{userId}")
    Example deleteUser(@PathVariable Long userId);

}
