package com.example.SovcomSmsService.services;

import notification.SmsNotification;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService {

    public String sendSmsNotification(SmsNotification smsNotiication) {
        return smsNotiication.getText();
    }
}
