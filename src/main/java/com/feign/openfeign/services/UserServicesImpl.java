package com.feign.openfeign.services;

import com.feign.openfeign.client.UserClient;
import com.feign.openfeign.dto.Example;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserClient userClient;
    @Override
    public List<Example> getAllUsers() {
        return userClient.getUsers();
    }

    @Override
    public Example getUserById(Long id) {
        return userClient.getUserById(id);
    }

    @Override
    public Example create(Example user) {
        return userClient.createUser(user);
    }

    @Override
    public void updateUser(Long id, Example user) {
        userClient.updateUser(user);

    }

    @Override
    public void deleteUser(Long id) {
        userClient.deleteUser(id);
    }
}
