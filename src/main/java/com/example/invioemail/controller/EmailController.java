package com.example.invioemail.controller;


import com.example.invioemail.service.InvioEmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final InvioEmailService invioEmailService;

    public EmailController(InvioEmailService invioEmailService) {
        this.invioEmailService = invioEmailService;
    }

    @GetMapping("send")
    public ResponseEntity<String> sendEmail() throws MessagingException {

        this.invioEmailService.invioEmail();


        return ResponseEntity.ok("Invio avvenuto con successo");
    }

}
