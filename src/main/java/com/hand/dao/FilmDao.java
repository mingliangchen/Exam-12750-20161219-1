package com.hand.dao;

import java.util.List;

import com.hand.entity.Film;

public interface FilmDao {
	List<Film> QueryAllFilm();
	
	
	int deleteById(int film_id);
	
	int insertFilm(Film film);
	
	int updateFilm(Film film);
}
