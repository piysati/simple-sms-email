package com.project.service;

import com.project.exception.EmailException;
import com.project.utility.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements INotificationService {

	private static final Logger LOG = LoggerFactory.getLogger(NotificationService.class);

	@Autowired
	private EmailService emailService;

	@Override
	public void notifySimple() throws EmailException {
		emailService.sendSimpleEmail();
	}
}
