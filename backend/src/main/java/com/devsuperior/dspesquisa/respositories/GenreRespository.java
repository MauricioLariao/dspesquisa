package com.devsuperior.dspesquisa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Genre;

//extender a interface de jparepository para realizar os acessos as entidades
public interface GenreRespository extends JpaRepository<Genre, Long> {

}
