package com.devsuperior.dspesquisa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Game;

//extender a interface de jparepository para realizar os acessos as entidades
@Repository //para registrar esse repositorio a ter insjecao de dependencia
public interface GameRepository extends JpaRepository<Game, Long> {

}
