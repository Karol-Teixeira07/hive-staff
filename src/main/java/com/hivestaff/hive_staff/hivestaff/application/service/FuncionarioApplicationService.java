package com.hivestaff.hive_staff.hivestaff.application.service;

import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioDetalhadoResponse;
import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioRequest;
import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioResponse;
import com.hivestaff.hive_staff.hivestaff.application.repository.FuncionarioRepository;
import com.hivestaff.hive_staff.hivestaff.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;
    @Override
    public FuncionarioResponse criaNovoFuncionario(FuncionarioRequest novoFuncionario) {
        log.info("[inicia] FuncionarioApplicationService - criaNovoFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(novoFuncionario));
        log.info("[finaliza] FuncionarioApplicationService - criaNovoFuncionario");
        return new FuncionarioResponse(funcionario);
    }

    @Override
    public FuncionarioDetalhadoResponse buscaPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioApplicationService - buscaPorId");
        log.info("[idFuncionario] {}", idFuncionario);
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioPorId(idFuncionario);
        log.info("[finaliza] FuncionarioApplicationService - buscaPorId");
        return new FuncionarioDetalhadoResponse(funcionario);
    }
}
