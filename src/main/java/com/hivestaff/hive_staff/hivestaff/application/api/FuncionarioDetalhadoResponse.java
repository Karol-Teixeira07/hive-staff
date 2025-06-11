package com.hivestaff.hive_staff.hivestaff.application.api;

import com.hivestaff.hive_staff.hivestaff.domain.Endereco;
import com.hivestaff.hive_staff.hivestaff.domain.Funcionario;
import com.hivestaff.hive_staff.hivestaff.domain.Sexo;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class FuncionarioDetalhadoResponse {

    private UUID idFuncionario;
    private String nome;
    private String designacao;
    private String salario;
    private String numeroTelefone;
    private Endereco endereco;
    private Sexo sexo;
    private String dataNascimento;
    private String cpf;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAlteracao;

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nome = funcionario.getNome();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.numeroTelefone = funcionario.getNumeroTelefone();
        this.endereco = funcionario.getEndereco();
        this.sexo = funcionario.getSexo();
        this.dataNascimento = funcionario.getDataNascimento();
        this.cpf = funcionario.getCpf();
        this.dataCadastro = funcionario.getDataCadastro();
        this.dataAlteracao = funcionario.getDataAlteracao();
    }
}
