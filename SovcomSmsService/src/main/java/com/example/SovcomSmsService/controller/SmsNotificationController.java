package com.example.SovcomSmsService.controller;

import com.example.SovcomSmsService.services.SmsNotificationService;
import notification.SmsNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
public class SmsNotificationController {

    @Autowired
    SmsNotificationService smsNotificationService;
    @PostMapping("/notification")
    public String smsNotification(@RequestBody SmsNotification smsNotification) {
        return smsNotificationService.sendSmsNotification(smsNotification);
    }
}
