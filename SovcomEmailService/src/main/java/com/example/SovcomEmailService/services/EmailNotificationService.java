package com.example.SovcomEmailService.services;

import notification.EmailNotification;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService {

    public String sendEmailNotification(EmailNotification notification) {
        return notification.getText();
    }
}
