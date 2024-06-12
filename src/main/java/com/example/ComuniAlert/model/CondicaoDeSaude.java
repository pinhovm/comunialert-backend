package com.example.ComuniAlert.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class CondicaoDeSaude {
    private boolean isGestante, hasHipertensaoArterial,
        hasDiabetes, hasDoencaCardiaca;
}
