package com.meitech.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meitech.dslist.dto.GameDTO;
import com.meitech.dslist.dto.GameListDTO;
import com.meitech.dslist.dto.GameMinDTO;
import com.meitech.dslist.services.GameListService;
import com.meitech.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{idLista}/games")
	public List<GameMinDTO> findByList( @PathVariable Long idLista){
		return gameService.fiindByList(idLista);
	}
	 
}
