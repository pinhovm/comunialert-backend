package com.example.ComuniAlert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ACS extends Pessoa{
    private int area, microArea;
}
