package com.example.ComuniAlert.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    Sexo sexo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dtNascimento;
    @Email(message = "O campo Email deve possuir um email valido")
    private String email;
    private String telefone;
}

