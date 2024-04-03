package com.example.ComuniAlert.cidadao;

import com.example.ComuniAlert.familia.FamiliaEntity;
import com.example.ComuniAlert.model.CondicaoDeSaude;
import com.example.ComuniAlert.model.ParentescoFamiliar;
import com.example.ComuniAlert.model.Pessoa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "familia_id") // Nome da coluna que representa o relacionamento no banco de dados
    private FamiliaEntity familia;
    private boolean isChefeDeFamilia;
    @Embedded
    private CondicaoDeSaude condicaoDeSaude;
    private ParentescoFamiliar parentescoFamiliar;
    @NotNull
    private String identidade;
    @NotNull
    @Length(min = 15, max = 15)
    private String cns;  //cartao sus
    private String nomeDaMae;
    private String nomeDoPai;
    @Length(min = 11, max = 11)
    @NotNull
    private String cpf;


}
