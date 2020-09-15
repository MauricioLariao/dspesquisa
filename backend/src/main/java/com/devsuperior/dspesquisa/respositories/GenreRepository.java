package com.devsuperior.dspesquisa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Genre;

//extender a interface de jparepository para realizar os acessos as entidades
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
