package com.example.ComuniAlert.cidadao;


import com.example.ComuniAlert.cidadao.CidadaoEntity;
import com.example.ComuniAlert.exceptions.CidadaoExistsException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//github copilot please do create functions to search for Cidadao atraves de uma chave unica chamada CPF

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {

    @Autowired
    private CidadaoRepository cidadaoRepository;

    @PostMapping("/")
    public CidadaoEntity createCidadao(@Valid @RequestBody CidadaoEntity cidadaoEntity){
        this.cidadaoRepository
        .findByCnsOrCpf(cidadaoEntity.getCns(), cidadaoEntity.getCpf())
        .ifPresent((cidadao)-> {
            throw new CidadaoExistsException();
        });
        return this.cidadaoRepository.save(cidadaoEntity);
    }

    //buscar cidadao com um parametro especifico -> cpf
    @GetMapping("/buscar")
    public ResponseEntity<CidadaoEntity> searchCidadao (@RequestParam String cpf){
        CidadaoEntity cidadao = cidadaoRepository.findByCpf(cpf);
        if(cidadao != null){
            return ResponseEntity.ok(cidadao);
        }else{
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
