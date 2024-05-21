package com.example.ComuniAlert.cidadao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CidadaoRepository extends JpaRepository<CidadaoEntity, UUID> {
    Optional<CidadaoEntity> findByCns(String cns);

    Optional<CidadaoEntity> findByCpf(String cpf);
}
