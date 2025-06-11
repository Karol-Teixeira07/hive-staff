package com.hivestaff.hive_staff.hivestaff.domain;

import com.hivestaff.hive_staff.hivestaff.application.api.EnderecoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Endereco {
    @Id
    private UUID idEndereco;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;

    public Endereco(EnderecoRequest enderecoRequest) {
        this.idEndereco = UUID.randomUUID();
        this.cep = enderecoRequest.getCep();
        this.logradouro = enderecoRequest.getLogradouro();
        this.numero = enderecoRequest.getNumero();
        this.bairro = enderecoRequest.getBairro();
        this.cidade = enderecoRequest.getCidade();
        this.estado = enderecoRequest.getEstado();
        this.complemento = enderecoRequest.getComplemento();
    }


}
