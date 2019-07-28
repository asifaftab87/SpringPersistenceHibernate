package org.liferayasif.notifications;

import org.liferayasif.notifications.dto.Mail;
import org.liferayasif.notifications.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationsApplication implements ApplicationRunner {

	private static Logger log = LoggerFactory.getLogger(NotificationsApplication.class);
	
	@Autowired
    private EmailService emailService;
	
	public static void main(String[] args) {
		SpringApplication.run(NotificationsApplication.class, args);
	}
	
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
      /*
		log.info("Spring Mail - Sending Email Attachment Configuration Example");

        Mail mail = new Mail();
        mail.setFrom("atifaftab001@gmail.com");
        mail.setTo("asifaftab87@gmail.com");
        mail.setSubject("Sending Email Attachment Configuration Example");
        mail.setBodyContent("This tutorial demonstrates how to send an email with attachment using Spring Framework.");

        emailService.sendSimpleMessage(mail);
        */
    }

}
