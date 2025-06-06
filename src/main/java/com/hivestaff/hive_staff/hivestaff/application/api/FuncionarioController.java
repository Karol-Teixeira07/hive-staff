package com.hivestaff.hive_staff.hivestaff.application.api;

import com.hivestaff.hive_staff.hivestaff.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
