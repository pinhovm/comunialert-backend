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
    private boolean isGestante, isUsoDeAlcool, isUsoDeDrogas, isHipertensaoArterial,
        isDiabetes, isAVCouDerrame, isInfarto, isDoencaCardiaca,
        isInsuficienciaRenal, isDoencaRespiratoria, isAsma, isHanseniase,
        isTuberculose, isCancer, isAcamado, isDomicilado;
}
