package com.hivestaff.hive_staff.hivestaff.domain;

import com.hivestaff.hive_staff.hivestaff.application.api.FuncionarioRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Funcionarios")
public class Funcionario {

    @Id
    private UUID idFuncionario;
    @NotBlank
    private String nome;
    private String designacao;
    private String salario;
    private String numeroTelefone;
    private Endereco endereco;
    private Sexo sexo;
    private String dataNascimento;
    @CPF
    private String cpf;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAlteracao;

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.dataCadastro = LocalDateTime.now();
        this.cpf = funcionarioRequest.getCpf();
        this.dataNascimento = funcionarioRequest.getDataNascimento();
        this.sexo = funcionarioRequest.getSexo();
        this.endereco = new Endereco(funcionarioRequest.getEndereco());
        this.numeroTelefone = funcionarioRequest.getNumeroTelefone();
        this.salario = funcionarioRequest.getSalario();
        this.designacao = funcionarioRequest.getDesignacao();
        this.nome = funcionarioRequest.getNome();
        this.idFuncionario = UUID.randomUUID();
    }
}
