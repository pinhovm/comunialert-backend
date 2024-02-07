package com.example.ComuniAlert.cidadao;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {
    @GetMapping("/buscar")
    public String teste(){
        return "Ate aqui ta ok";
    }
}
