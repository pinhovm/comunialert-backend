package com.example.ComuniAlert.exceptions;

public class CidadaoExistsException extends RuntimeException{
    public CidadaoExistsException(){
        super("CNS ou CPF ja cadastrado");
    }
}
