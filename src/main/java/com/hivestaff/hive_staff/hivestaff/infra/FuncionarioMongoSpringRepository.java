package com.hivestaff.hive_staff.hivestaff.infra;

import com.hivestaff.hive_staff.hivestaff.domain.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FuncionarioMongoSpringRepository extends MongoRepository<Funcionario, UUID> {

}
