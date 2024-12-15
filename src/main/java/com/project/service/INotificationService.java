package com.project.service;

import com.project.exception.EmailException;

public interface INotificationService {
	public void notifySimple() throws EmailException;
}