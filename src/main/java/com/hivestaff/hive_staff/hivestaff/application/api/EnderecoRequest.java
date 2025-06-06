package com.hivestaff.hive_staff.hivestaff.application.api;

import lombok.Data;
@Data
public class EnderecoRequest {
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
}
