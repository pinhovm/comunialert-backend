package com.example.ComuniAlert.familia;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="tb_familias")
public class FamiliaEntity {
    private boolean isAtiva;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id ;

    private String apelido;

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


}
