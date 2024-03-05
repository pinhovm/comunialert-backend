package com.example.ComuniAlert.cidadao;

import com.example.ComuniAlert.model.CondicaoDeSaude;
import com.example.ComuniAlert.model.ParentescoFamiliar;
import com.example.ComuniAlert.model.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_cidadaos")
public class CidadaoEntity extends Pessoa {

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
    @Length(min = 15, max = 15)
    private String cns;  //cartao sus
    private String nomeDaMae;
    private String nomeDoPai;
    @Column(unique = true)
    @Length(min = 11, max = 11)
    private String cpf;
}
