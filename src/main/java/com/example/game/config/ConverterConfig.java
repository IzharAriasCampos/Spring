package com.example.game.config;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.game.convert.GenreRequestToGenreConverter;

public class ConverterConfig implements WebMvcConfigurer{

	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		registry.addConverter(new GenreRequestToGenreConverter());
	}
}
