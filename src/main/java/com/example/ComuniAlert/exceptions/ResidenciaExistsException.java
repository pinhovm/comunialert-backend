package com.example.ComuniAlert.exceptions;

public class ResidenciaExistsException extends RuntimeException{
    public ResidenciaExistsException(){
        super("Residencia já cadastrada");
    }
}