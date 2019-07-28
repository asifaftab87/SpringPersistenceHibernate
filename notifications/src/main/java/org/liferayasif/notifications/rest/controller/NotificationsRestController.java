package org.liferayasif.notifications.rest.controller;

import javax.mail.MessagingException;

import org.liferayasif.notifications.dto.Mail;
import org.liferayasif.notifications.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsRestController {

	@Autowired
    private EmailService emailService;
	
	@RequestMapping(value = "/registrationDetails", method = RequestMethod.POST)
	public Boolean registrationDetails(@RequestBody Mail mail) {
		
       // mail.setFrom("atifaftab001@gmail.com");
       // mail.setTo("asifaftab87@gmail.com");
       // mail.setSubject("Sending Email Attachment Configuration Example");
       // mail.setBodyContent("This tutorial demonstrates how to send an email with attachment using Spring Framework.");

        try {
			emailService.sendSimpleMessage(mail);
		} 
        catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}
}
