package com.example.game.convert;

import java.util.List;

import com.example.game.entities.Genre;
import com.example.game.enums.GenderEnum;
import com.fasterxml.jackson.databind.util.Converter;

public class GenreRequestToGenreConverter implements Converter<LisGenreEnum, List<Genre>>{
	
	@Override
	public Genre convert(GenderEnum genreEnum) {
		Genre genre = new Genre();
		genre.setGenreName(genreEnum);
		return genre;
	}
}
