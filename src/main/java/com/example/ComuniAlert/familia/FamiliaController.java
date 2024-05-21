package com.example.ComuniAlert.familia;

import com.example.ComuniAlert.exceptions.ResidenciaExistsException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/familias")
public class FamiliaController {

    @Autowired
    private FamiliaRepository familiaRepository;

    @PostMapping("/cadastrar")
    public FamiliaEntity cadastrarFamilia(@Valid @RequestBody FamiliaEntity familiaEntity, int area, int microarea){
        this.familiaRepository
                .findByRuaAndNumero(familiaEntity.getRua(), familiaEntity.getNumero())
                .ifPresent((familia)-> {
                    throw new ResidenciaExistsException();
                });
        familiaEntity.setArea(area);
        familiaEntity.setMicroArea(microarea);
        return this.familiaRepository.save(familiaEntity);
    }

    @GetMapping("/familias")
    public ResponseEntity<List<Optional<FamiliaEntity>>> getFamilias(int area, int microarea){
        Optional<FamiliaEntity> familias = this.familiaRepository.findByAreaAndMicroArea(area, microarea);
        if(familias != null){
            return ResponseEntity.ok(Collections.singletonList(familias));
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

}
