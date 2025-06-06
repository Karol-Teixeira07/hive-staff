package com.hivestaff.hive_staff.hivestaff.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping (value = "/v1/funcionario")
public interface FuncionarioApi {
    @PostMapping
    @ResponseStatus (value = HttpStatus.CREATED)
    FuncionarioResponse criaFuncionario(@RequestBody @Valid FuncionarioRequest novoFuncionario);

}
