package com.example.game.convert;

import java.util.List;

import org.springframework.core.convert.converter.Converter;

import com.example.game.dtos.request.GameRequest;
import com.example.game.entities.Game;
import com.example.game.entities.Genre;
import com.example.game.enums.GenderEnum;




//Solo un objeto, no lista
public class GameRequestToGameConverter implements  Converter <GameRequest, Game>{

	@Override
	public Game convert(GameRequest gameRequest) {
		Game game = new Game();
		game.setTitle(gameRequest.getTitle());
		game.setDescription(gameRequest.getDescription());
		game.setRelease(gameRequest.getRelease());
		return game;
	}

	


	

	

	
}
