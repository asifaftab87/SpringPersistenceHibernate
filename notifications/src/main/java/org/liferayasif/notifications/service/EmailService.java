package org.liferayasif.notifications.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.liferayasif.notifications.dto.Mail;
import org.liferayasif.notifications.dto.MailAttachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(Mail mail) throws MessagingException {

        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setSubject(mail.getSubject());
        helper.setText(mail.getBodyContent());
        helper.setTo(mail.getTo());
        helper.setFrom(mail.getTo());

        MailAttachment mailAttachment = mail.getMailAttachment();
        if(mailAttachment!=null && mailAttachment.getFile()!=null) {
        	final InputStreamSource attachmentSource = new ByteArrayResource(mailAttachment.getFile());
        	 helper.addAttachment(mailAttachment.getFileName(), attachmentSource, mailAttachment.getMimeType());
        }
       // helper.addAttachment("attachment-document-name.jpg", new ClassPathResource("rightsofnikah.jpg"));
       
        emailSender.send(message);

    }
}
