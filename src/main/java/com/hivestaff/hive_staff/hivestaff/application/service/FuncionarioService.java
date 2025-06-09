package com.hivestaff.hive_staff.hivestaff.application.service;

import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioDetalhadoResponse;
import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioRequest;
import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioResponse;

import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaNovoFuncionario(FuncionarioRequest novoFuncionario);
    FuncionarioDetalhadoResponse buscaPorId(UUID idFuncionario);

    void deletaPorId(UUID idFuncionario);
}
