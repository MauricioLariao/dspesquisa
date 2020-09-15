package com.devsuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.respositories.GameRepository;

@Service
public class GameService {

	@Autowired // para criar a injecao de dependencia e facilitar o acesso a classe repository
	private GameRepository respository;

	@Transactional(readOnly = true) //para evitar o locking no bd
	public List<GameDTO> findAll() {
		List<Game> list = respository.findAll();
		// return stream pq aceita ordenacao e funcoes lambda
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList()); // cada objeto map da lista transformo num gamDTO passando ele
														// como argumento
	}
}
