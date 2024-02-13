package com.example.ComuniAlert.cidadao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CidadaoRepository extends JpaRepository<CidadaoEntity, UUID> {

}
