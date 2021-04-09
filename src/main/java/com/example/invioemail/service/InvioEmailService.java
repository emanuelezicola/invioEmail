package com.example.invioemail.service;

import com.example.invioemail.model.InfoEmailDto;

import javax.mail.MessagingException;

public interface InvioEmailService {


    void invioEmail() throws MessagingException;

    void invioEmailWithData(InfoEmailDto infoEmailDto) throws MessagingException;
}
