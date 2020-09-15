package com.devsuperior.dspesquisa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Record;

//extender a interface de jparepository para realizar os acessos as entidades
public interface RecordRespository extends JpaRepository<Record, Long> {

}
