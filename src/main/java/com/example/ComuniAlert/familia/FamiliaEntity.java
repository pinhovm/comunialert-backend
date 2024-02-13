package com.example.ComuniAlert.familia;


import com.example.ComuniAlert.cidadao.CidadaoEntity;
import com.example.ComuniAlert.model.Endereco;
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
public class FamiliaEntity {
    private boolean isAtiva;
    Endereco endereco;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    List<CidadaoEntity> familia = new ArrayList<>();
    @CreationTimestamp
    private LocalDateTime dataDoCadastroFamiliar;
    private int area, microArea;
}
