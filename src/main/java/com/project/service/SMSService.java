package com.project.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class SMSService implements ISMSService{

    //add your secrets here
    private final String  ACCOUNT_SID = "your_account_sid";
    private final String AUTH_TOKEN = "your_auth_token";
    private final String Your_TWILIO_NUMBER = "drom which number will you send it";
    private final String to_Phone_Number = "some random number to which you want to send data";

    @Override
    public void sendSimpleSMS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(new PhoneNumber(to_Phone_Number), new PhoneNumber(Your_TWILIO_NUMBER),
                "Hello, this is a Sample Message sent from a Spring Boot Application").create();
    }
}
