package com.hand.service;

import java.util.List;

import com.hand.entity.Film;

public interface FilmService {
	List<Film> queryFilmList();
	
	int deleteFilm(Integer film_id);
	
	int insertFilm(Film film);
	
	int updateFilm(Film film);
}
