package com.example.ComuniAlert.cidadao;


import com.example.ComuniAlert.exceptions.CidadaoExistsException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {

    @Autowired
    private CidadaoRepository cidadaoRepository;

    @PostMapping("/")
    public CidadaoEntity createCidadao(@Valid @RequestBody CidadaoEntity cidadaoEntity){
        this.cidadaoRepository
            .findByCns(cidadaoEntity.getCns())
                .ifPresent((cidadao)-> {
            throw new CidadaoExistsException("CNS já cadastrado");
        });
        this.cidadaoRepository
            .findByCpf(cidadaoEntity.getCpf())
                .ifPresent((cidadao)-> {
                    throw new CidadaoExistsException("CPF já cadastrado");
                });
        //salva o cidadao caso nao haja cpf ou cns já cadastrado
        return this.cidadaoRepository.save(cidadaoEntity);
    }

    //buscar cidadao com um parametro especifico -> cpf
    @GetMapping("/buscar")
    public ResponseEntity<Optional<CidadaoEntity>> searchCidadao (@RequestParam String key) {
        Optional<CidadaoEntity> cidadao = null;
        if (key.length() == 11) {
            cidadao = cidadaoRepository.findByCpf(key);
        } else if (key.length() == 15) {
            cidadao = cidadaoRepository.findByCns(key);
        }
        if (cidadao != null) {
            return ResponseEntity.ok(cidadao);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }


    //retorna todos os cidadaos
    @GetMapping("/home")
    public ResponseEntity<List<CidadaoEntity>> findAll (){
        List<CidadaoEntity> cidadao = cidadaoRepository.findAll();
        return ResponseEntity.ok(cidadao);
    }


}
