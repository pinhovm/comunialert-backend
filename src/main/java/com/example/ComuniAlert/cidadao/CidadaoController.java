package com.example.ComuniAlert.cidadao;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {
    @GetMapping("/buscar")
    public String teste(){
        return "Ate aqui ta ok";
    }

    @PostMapping("/")
    public void createCidadao(@RequestBody CidadaoModel cidadaoModel){
        System.out.println("Cidadao cadastrado");
        System.out.println(cidadaoModel.getNome());

    }
}
