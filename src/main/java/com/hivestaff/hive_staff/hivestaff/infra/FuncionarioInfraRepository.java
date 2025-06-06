package com.hivestaff.hive_staff.hivestaff.infra;

import com.hivestaff.hive_staff.hivestaff.application.repository.FuncionarioRepository;
import com.hivestaff.hive_staff.hivestaff.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

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
}
