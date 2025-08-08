package com.wipro.userms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.userms.dto.UserNotificationDTO;
import com.wipro.userms.entity.User;
import com.wipro.userms.repo.UserRepository;
import com.wipro.userms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private RestTemplate restTemplate;

    private final String NOTIFY_URL = "http://NOTIFICATION-MS/notify";

    @Override
    public User saveUser(User user) {
        User userSave = repo.save(user);
        notifyService(userSave, "Created");
        return userSave;
    }

    @Override
    public User updateUser(User user, int id) {
        User existing = repo.findById(id).orElseThrow();
        existing.setUsername(user.getUsername());
        existing.setPassword(user.getPassword());
        existing.setAddress(user.getAddress());
        User updated = repo.save(existing);
        notifyService(updated, "Updated");
        return updated;
    }

    @Override
    public void deleteUser(int id) {
        User user = repo.findById(id).orElseThrow();
        repo.delete(user);
        notifyService(user, "Deleted");
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    private void notifyService(User user, String action) {
        UserNotificationDTO dto = new UserNotificationDTO();
        dto.setUser(user);
        dto.setAction(action);
        restTemplate.postForObject(NOTIFY_URL, dto, String.class);
    }
}
