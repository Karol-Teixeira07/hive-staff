package com.hivestaff.hive_staff.hivestaff.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping (value = "/v1/funcionario")
public interface FuncionarioApi {
    @PostMapping
    @ResponseStatus (value = HttpStatus.CREATED)
    FuncionarioResponse criaFuncionario(@RequestBody @Valid FuncionarioRequest novoFuncionario);

    @GetMapping (value = "/busca-por-id/{idFuncionario}")
    @ResponseStatus (value = HttpStatus.OK)
    FuncionarioDetalhadoResponse buscaFuncionarioPorId(@PathVariable UUID idFuncionario);

    @DeleteMapping (value = "/deleta-por-id/{idFuncionario}")
    @ResponseStatus (value = HttpStatus.NO_CONTENT)
    void deletaFuncionarioPorId (@PathVariable UUID idFuncionario);

    @PatchMapping (value = "/atualiza-por-id/{idFuncionario}")
    @ResponseStatus (value = HttpStatus.NO_CONTENT)
    void atualizaFuncionarioPorId (@PathVariable UUID idFuncionario, @RequestBody @Valid FuncionarioAtualizacaoRequest atualizaFuncionarioPorId);

}
