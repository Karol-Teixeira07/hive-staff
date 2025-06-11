package com.hivestaff.hive_staff.hivestaff.application.api;

import com.hivestaff.hive_staff.hivestaff.domain.Funcionario;
import lombok.Getter;

import java.util.UUID;

@Getter
public class FuncionarioResponse {
    private UUID idFuncionario;

    public FuncionarioResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
    }
}
