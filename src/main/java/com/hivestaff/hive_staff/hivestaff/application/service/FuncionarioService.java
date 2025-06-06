package com.hivestaff.hive_staff.hivestaff.application.service;

import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioRequest;
import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criaNovoFuncionario(FuncionarioRequest novoFuncionario);
}
