package com.example.ComuniAlert.cidadao;


import com.example.ComuniAlert.cidadao.CidadaoEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//github copilot please do create functions to search for Cidadao atraves de uma chave unica chamada CPF

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {
    @Autowired
    private CidadaoRepository cidadaoRepository;


    @PostMapping("/")
    public CidadaoEntity createCidadao(@Valid @RequestBody CidadaoEntity cidadaoEntity){
        return this.cidadaoRepository.save(cidadaoEntity);

    }
}
