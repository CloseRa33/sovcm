package com.example.SovcomSmsService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SmsNotificationController {
    @PostMapping("/notification")
    public String smsNotification() {
        return "Количество случаев короновируса в Саратовской области выросло. Соблюдайте самоизоляцию! MCHS";
    }
}
