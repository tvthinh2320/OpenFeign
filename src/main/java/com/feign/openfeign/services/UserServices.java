package com.feign.openfeign.services;

import com.feign.openfeign.dto.Example;

import java.util.List;

public interface UserServices {
    List<Example> getAllUsers();
    Example getUserById(Long id);
    Example create(Example user);
    void updateUser(Long id, Example user);
    void deleteUser(Long id);
}
