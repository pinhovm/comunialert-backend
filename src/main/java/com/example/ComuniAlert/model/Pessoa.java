package com.example.ComuniAlert.model;


import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String nome;
    Sexo sexo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dtNascimento;
    @Email(message = "O campo Email deve possuir um email valido")
    private String email;
    private String telefone;
}

