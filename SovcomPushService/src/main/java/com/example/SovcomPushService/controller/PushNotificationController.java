package com.example.SovcomPushService.controller;


import com.example.SovcomPushService.services.PushNotificationService;
import notification.PushNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/push")
public class PushNotificationController {

    @Autowired
    PushNotificationService pushNotificationService;

    @PostMapping("/notification")
    public String pushNotification(@RequestBody PushNotification pushNotification) {
        return pushNotificationService.sendPushNotification(pushNotification);
    }
}
