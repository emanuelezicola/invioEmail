package com.example.invioemail.controller;


import com.example.invioemail.model.InfoEmailDto;
import com.example.invioemail.service.InvioEmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("send")
    public ResponseEntity<String> sendEmailWithData(@RequestBody InfoEmailDto infoEmailDto) throws MessagingException {

        this.invioEmailService.invioEmailWithData(infoEmailDto);


        return ResponseEntity.ok("Invio avvenuto con successo");
    }

}
