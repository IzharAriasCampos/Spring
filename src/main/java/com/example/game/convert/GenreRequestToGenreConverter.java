package com.example.game.convert;

import java.util.List;

import org.springframework.core.convert.converter.Converter;

import com.example.game.entities.Genre;
import com.example.game.enums.GenderEnum;




//Solo un objeto, no lista
public class GenreRequestToGenreConverter implements  Converter <GenderEnum, Genre>{

	@Override
	public Genre convert(GenderEnum genreEnum) {
		Genre genre = new Genre();
		genre.setGenreName(genreEnum);
		return genre;
	}


	

	

	
}
