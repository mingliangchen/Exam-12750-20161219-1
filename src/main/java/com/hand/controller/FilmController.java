package com.hand.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.entity.Film;
import com.hand.entity.Language;
import com.hand.service.FilmService;
import com.hand.service.LanguageService;


@Controller
@RequestMapping("/film")
public class FilmController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	FilmService  filmService;
	@Autowired
	LanguageService languageService; 
	
	@RequestMapping("/filmList")
	public String list(Model model){
		List<Film> filmList= filmService.queryFilmList();
		model.addAttribute("filmList", filmList);
		System.out.println(filmList.get(1).getFilm_id()+"22222" 
				+filmList.get(1).getLanguage().getName());
		return "/filmList";
	}
	@RequestMapping(value="/{film_id}/delete" ,method = RequestMethod.GET)
	public String delete(@PathVariable("film_id") Integer film_id,Model model){
		if(film_id==null){
			return "filmList";
		}
		int i=filmService.deleteFilm(film_id);
		
		return "filmList";
	}
	@RequestMapping(value="/insert" ,method=RequestMethod.GET)
	public String insertFilm(String title,String description,String language,Model model){
		if(title==null){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
			List<Language> lans=languageService.getLanguageName();
			model.addAttribute("lans", lans);
			return "insert";
		}
		Film film =new Film();
		Language language2=new Language();
		language2.setName(language);
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage(language2);
		int i=filmService.insertFilm(film);
		System.out.println("II::::"+i);
		this.list(model);
		return "filmList";
	}
	
}
