package com.example.invioemail.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InfoEmailDto {

    private String oggetto;
    private String testo;
    private String destinatario;

}
