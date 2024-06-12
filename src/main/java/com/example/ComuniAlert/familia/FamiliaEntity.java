package com.example.ComuniAlert.familia;


import com.example.ComuniAlert.cidadao.CidadaoEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="tb_familias")
public class FamiliaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id ;
    private String apelidoHof;
    @CreationTimestamp
    private LocalDateTime dataDoCadastroFamiliar;
    private int area, microArea;
    @NotNull
    private String cep;
    @NotNull
    private String numero;
    @NotNull
    private String rua;
    @NotNull
    private String cidade;
    @NotNull
    private String estado;
    @NotNull
    private String pais;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CidadaoEntity> membrosFamiliares;


}
