package com.example.game.convert;

import java.util.List;

import com.example.game.entities.Genre;
import com.example.game.enums.GenderEnum;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class GenreRequestToGenreConverter implements Converter <List<GenderEnum>, List<Genre>>{
	

	public Genre convert(GenderEnum genreEnum) {
		Genre genre = new Genre();
		genre.setGenreName(genreEnum);
		return genre;
	}

	@Override
	public List<Genre> convert(List<GenderEnum> value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaType getInputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaType getOutputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}
}
