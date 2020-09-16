package com.devsuperior.dspesquisa.respositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Record;

//extender a interface de jparepository para realizar os acessos as entidades
@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

	//usar a linguagem jpql(orientada a objetos) //macete pra pegar todos qdo a dat afor null. data null retorna true
	@Query("SELECT obj FROM Record obj WHERE "
			+ "(coalesce(:min, null) IS NULL OR obj.moment >= :min) AND "
			+ "(coalesce(:max, null) IS NULL OR obj.moment <= :max)") //coalesce para o null funcionar no postgree
	Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);

}
