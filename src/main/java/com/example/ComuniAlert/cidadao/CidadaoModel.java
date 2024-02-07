package com.example.ComuniAlert.cidadao;

import com.example.ComuniAlert.model.CondicaoDeSaude;
import com.example.ComuniAlert.model.ParentescoFamiliar;
import com.example.ComuniAlert.model.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_cidadaos")
@Table
public class CidadaoModel extends Pessoa {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private long familiaId;
    private boolean isChefeDeFamilia;
    @Embedded
    private CondicaoDeSaude condicaoDeSaude;
    ParentescoFamiliar parentescoFamiliar;
    @Column(unique = true)
    private String identidade;
    @Column(unique = true)
    private String cns;  //cartao sus
    private String nomeDaMae;
    private String nomeDoPai;
    @Column(unique = true)
    private String cpf;
}
