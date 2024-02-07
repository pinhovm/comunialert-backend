package com.example.ComuniAlert.model;


import com.example.ComuniAlert.cidadao.CidadaoModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


// ao adicionar uma familia vai gerar um ID

// ao adicionar uma pessoa a familia, o ID deve ser setado, sinalizando que a pessoa pertence a familia em questao
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Familia {
    private boolean isAtiva;
    Endereco endereco;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    List<CidadaoModel> familia = new ArrayList<>();
    @CreationTimestamp
    private LocalDateTime dataDoCadastroFamiliar;
    private int area, microArea;
}
