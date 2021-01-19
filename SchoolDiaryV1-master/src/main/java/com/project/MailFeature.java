package com.project;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
@Component
public class MailFeature {

    @Autowired
    private JavaMailSender javamailsender;


    public  void send(String to, String subject, String body) throws MessagingException {

        SimpleMailMessage helper = new SimpleMailMessage();
        helper.setFrom("54654a8828482c");
        helper.setSubject(subject);
        helper.setTo(to);
        helper.setText(body);
        javamailsender.send(helper);

    }
}
