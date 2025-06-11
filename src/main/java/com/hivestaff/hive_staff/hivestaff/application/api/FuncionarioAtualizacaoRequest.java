package com.hivestaff.hive_staff.hivestaff.application.api;

import com.hivestaff.hive_staff.hivestaff.domain.Endereco;
import com.hivestaff.hive_staff.hivestaff.domain.Sexo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioAtualizacaoRequest {


    private String nome;
    private String designacao;
    private String salario;
    private String numeroTelefone;
    private Endereco endereco;
    private String dataNascimento;

}
