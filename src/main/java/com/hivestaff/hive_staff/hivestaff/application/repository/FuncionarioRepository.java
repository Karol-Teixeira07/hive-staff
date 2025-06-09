package com.hivestaff.hive_staff.hivestaff.application.repository;

import com.hivestaff.hive_staff.hivestaff.domain.Funcionario;

import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);

    Funcionario buscaFuncionarioPorId(UUID idFuncionario);

    void deletaFuncionario(Funcionario funcionario);
}
