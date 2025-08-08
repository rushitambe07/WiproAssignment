package com.wipro.userms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.userms.entity.User;
import com.wipro.userms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User create(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable int id) {
        return service.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteUser(id);
    }

    @GetMapping
    public List<User> getAll() {
        return service.getAllUsers();
    }
}