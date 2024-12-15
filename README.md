A simple SMS Email sending app

This project is a Spring Boot Application that enables sending SMS or Emails based on API selection or a trigger. The application integrates Java Mail Sender for emails and Twilio API for SMS functionality.

Features:
Send SMS using Twilio API.
Send Emails using the Java Mail Sender library.
RESTful API endpoints.

Technologies Used:
Java (21)
Spring Boot (3.3.5)
Twilio API for SMS service
JavaMailSender for Email service
Maven for dependency management
RESTful APIs for communication

Setup Instructions
1. Cloning the Repository
2. Setting up Twilio
	Get the following details and add to SMS Service:
	Account SID
	Auth Token
	Twilio Phone Number
3. Configuring JavaMailSender,check the application.properties file.

Future Enhancements