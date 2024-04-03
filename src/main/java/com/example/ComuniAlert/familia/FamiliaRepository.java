package com.example.ComuniAlert.familia;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FamiliaRepository extends JpaRepository<FamiliaEntity, UUID> {
    Optional<FamiliaEntity> findById (UUID familia_id);
    Optional<FamiliaEntity> findByAreaAndMicroArea (int area, int microArea);

    Optional<FamiliaEntity> findByRuaAndNumero (String rua, String numero);
}
