package com.devsuperior.dspesquisa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Record;

//extender a interface de jparepository para realizar os acessos as entidades
@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
