package com.example.ComuniAlert.acs;

import com.example.ComuniAlert.model.Pessoa;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_ACS")
public class AgenteDeSaudeEntity extends Pessoa {
    private int area, microArea;
    private String cpf, senha;
}
