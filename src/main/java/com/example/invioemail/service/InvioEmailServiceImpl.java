package com.example.invioemail.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class InvioEmailServiceImpl implements InvioEmailService {

    private final JavaMailSender emailSender;

    public InvioEmailServiceImpl(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void invioEmail() throws MessagingException {
        MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("Invio prova Email");
        helper.setText("Questo è un messaggio di prova");
        helper.setTo("e.zicola@solvingteam.it");

        emailSender.send(mimeMessage);
    }
}
