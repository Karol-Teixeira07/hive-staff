package com.hivestaff.hive_staff.hivestaff.application.api;

import com.hivestaff.hive_staff.hivestaff.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class FuncionarioController implements FuncionarioApi {
    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest novoFuncionario) {
        log.info("[inicia] FuncionarioController - criaFuncionario");
        FuncionarioResponse criaFuncionario = funcionarioService.criaNovoFuncionario(novoFuncionario);
        log.info("[finaliza] FuncionarioController - criaFuncionario");
        return criaFuncionario;
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - buscaFuncionarioPorId");
        log.info("[idFuncionario] {}", idFuncionario);
        FuncionarioDetalhadoResponse funcionarioDetalhado = funcionarioService.buscaPorId(idFuncionario);
        log.info("[finaliza] FuncionarioController - buscaFuncionarioPorId");
        return funcionarioDetalhado;
    }

    @Override
    public void deletaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - deletaFuncionarioPorId");
        log.info("[idFuncionario] {}", idFuncionario);
        funcionarioService.deletaPorId(idFuncionario);
        log.info("[finaliza] FuncionarioController - deletaFuncionarioPorId");
    }

    @Override
    public void atualizaFuncionarioPorId(UUID idFuncionario, FuncionarioAtualizacaoRequest atualizaFuncionarioPorId) {
        log.info("[inicia] FuncionarioController - atualizaFuncionarioPorId");
        log.info("[idFuncionario] {}", idFuncionario);
        funcionarioService.atualizaPorId(idFuncionario, atualizaFuncionarioPorId);
        log.info("[finaliza] FuncionarioController - atualizaFuncionarioPorId");
    }
}
