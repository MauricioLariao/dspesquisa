package com.devsuperior.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.services.GameService;

//controlador para gerenciar as operacaoes relacionadas a games

@RestController
@RequestMapping(value = "/games") //rota principal do recurso
public class GameResource {
	
	@Autowired
	private GameService service;
	
	//implementar uma rota para testar com endpoint e retornar uma resposta de requisicao
	//o controlador deve conversar com a camada de servicos e transferir objetos do tipo DTO e o servico
	//acessa o repository e as entidades
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		
		List<GameDTO> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
}
