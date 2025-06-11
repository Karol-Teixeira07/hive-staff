package com.hivestaff.hive_staff.hivestaff.application.api;

import com.hivestaff.hive_staff.hivestaff.domain.Endereco;
import com.hivestaff.hive_staff.hivestaff.domain.Sexo;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class FuncionarioRequest {
    @NotBlank (message = "Nome obrigatório")
    private String nome;
    private String designacao;
    private String salario;
    @NotNull
    private String numeroTelefone;
    private EnderecoRequest endereco;
    private Sexo sexo;
    private String dataNascimento;
    @CPF
    @NotBlank
    @Size(min = 11, max = 14, message = "O cpf deve conter 11 digitos")
    private String cpf;

}
