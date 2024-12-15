package com.project.controller;

import com.project.exception.BaseException;
import com.project.service.ISMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sms")
public class SMSController {

    @Autowired
    private ISMSService ismsService;

    @GetMapping("/hi")
    public String getSome(){
        System.out.println("it has triggered");
        return "HI";
    }

    @PostMapping("/notify")
    public ResponseEntity<Object> sendsimpleSMS() throws BaseException {
        System.out.println("entered simple method");
        ismsService.sendSimpleSMS();
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
