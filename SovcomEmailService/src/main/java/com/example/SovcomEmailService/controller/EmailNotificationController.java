package com.example.SovcomEmailService.controller;
import com.example.SovcomEmailService.services.EmailNotificationService;
import notification.    EmailNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailNotificationController {

    @Autowired
    EmailNotificationService emailNotificationService;

    @PostMapping("/notification")
    public String emailNotification(@RequestBody EmailNotification notification) {
        return emailNotificationService.sendEmailNotification(notification);
    }
}
