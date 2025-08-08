package com.wipro.userms.service;

import java.util.List;

import com.wipro.userms.entity.User;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user, int id);
    void deleteUser(int id);
    List<User> getAllUsers();
}