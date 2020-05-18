package com.example.SovcomPushService.services;

import notification.PushNotification;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationService {

    public String sendPushNotification(PushNotification pushNotification) {
        return pushNotification.getText();
    }
}
