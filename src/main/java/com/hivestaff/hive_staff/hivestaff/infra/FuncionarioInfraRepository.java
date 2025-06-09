package com.hivestaff.hive_staff.hivestaff.infra;

import com.hivestaff.hive_staff.hivestaff.application.repository.FuncionarioRepository;
import com.hivestaff.hive_staff.hivestaff.domain.Funcionario;
import com.hivestaff.hive_staff.hivestaff.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
@EnableMongoRepositories
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioMongoSpringRepository funcionarioMongoSpringRepository;
    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - salva");
        Funcionario novoFuncionario = funcionarioMongoSpringRepository.save(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - salva");
        return funcionario;
    }

    @Override
    public Funcionario buscaFuncionarioPorId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioInfraRepository - buscaFuncionarioPorId");
        Funcionario funcionario = funcionarioMongoSpringRepository.findById(idFuncionario)
                        .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Funcionario não encontrado"));
        log.info("[finaliza] FuncionarioInfraRepository - buscaFuncionarioPorId");
        return funcionario;
    }

    @Override
    public void deletaFuncionario(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - deletaFuncionarioPorId");
        funcionarioMongoSpringRepository.delete(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - deletaFuncionarioPorId");
    }
}
