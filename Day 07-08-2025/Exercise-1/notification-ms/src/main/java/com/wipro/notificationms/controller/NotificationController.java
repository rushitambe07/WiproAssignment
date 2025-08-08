package com.wipro.notificationms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.notificationms.dto.UserNotificationDTO;

@RestController
public class NotificationController {
	@PostMapping("/notify")
    public ResponseEntity<String> notify(@RequestBody UserNotificationDTO dto) {
        String message = "User " + dto.getUser().getUsername() + " is " + dto.getAction();
        System.out.println(message);
        return ResponseEntity.ok(message);
    }

}
