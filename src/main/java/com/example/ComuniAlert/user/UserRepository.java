package com.example.ComuniAlert.user;

import com.example.ComuniAlert.cidadao.CidadaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<CidadaoEntity> findByCpf(String cpf);
}
