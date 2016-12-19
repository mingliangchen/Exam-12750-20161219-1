package com.hand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.FilmDao;
import com.hand.dao.LanguageDao;
import com.hand.entity.Film;
import com.hand.entity.Language;
import com.hand.service.FilmService;
@Service
public class FilmServiceImpl implements FilmService {
	@Autowired
	FilmDao filmdao;
	
	
	@Override
	public List<Film> queryFilmList() {
		List<Film> filmList=filmdao.QueryAllFilm();
		return filmList;
	}

	@Override
	public int deleteFilm(Integer film_id) {
		int i=filmdao.deleteById(film_id);
		return i;
	}
	
	@Override
	public int insertFilm(Film film) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateFilm(Film film) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
