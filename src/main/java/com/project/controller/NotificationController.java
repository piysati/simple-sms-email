package com.project.controller;

import com.project.exception.BaseException;
import com.project.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class NotificationController {

	@Autowired
	private INotificationService notificationService;

	@GetMapping("/hi")
	public String getSome(){
		System.out.println("it has triggered");
		return "HI";
	}

	@PostMapping("/notify")
	public ResponseEntity<Object> sendSimpleEmail() throws BaseException {
		System.out.println("entered simple email method");
		notificationService.notifySimple();
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
}
