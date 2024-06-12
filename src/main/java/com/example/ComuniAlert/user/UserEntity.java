package com.example.ComuniAlert.user;

import com.example.ComuniAlert.model.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_users")
public class UserEntity extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String login, senha;
    private int area, microArea;
    private enum roleFilter {
        ADMIN, SECRETARIO, ACS
    }
}
