package com.example.ComuniAlert.user;

import com.example.ComuniAlert.cidadao.CidadaoEntity;
import com.example.ComuniAlert.exceptions.CidadaoExistsException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/")
    public UserEntity createCidadao(@Valid @RequestBody UserEntity userEntity){
        this.userRepository
                .findByCpf(userEntity.getLogin())
                .ifPresent((user)-> {
                    throw new CidadaoExistsException("CPF já cadastrado");
                });
        //salva o usuario caso nao haja cpf já cadastrado
        return this.userRepository.save(userEntity);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> findAll (){
        List<UserEntity> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }
}
