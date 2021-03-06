package com.hand.entity;

import java.sql.Date;
import java.util.Set;

public class Film {
	private Integer film_id;
	private String title;
	private String description;
	private Date release_year;
	private Language language;
	private Integer original_language_id;
	private Integer rental_duration;
	private Double rental_rate;
	private Integer length;
	private Double replacemet_cost;
	private Set special_features;
	
	
	public Integer getFilm_id() {
		return film_id;
	}
	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getRelease_year() {
		return release_year;
	}
	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}
	
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Integer getOriginal_language_id() {
		return original_language_id;
	}
	public void setOriginal_language_id(Integer original_language_id) {
		this.original_language_id = original_language_id;
	}
	public Integer getRental_duration() {
		return rental_duration;
	}
	public void setRental_duration(Integer rental_duration) {
		this.rental_duration = rental_duration;
	}
	public Double getRental_rate() {
		return rental_rate;
	}
	public void setRental_rate(Double rental_rate) {
		this.rental_rate = rental_rate;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Double getReplacemet_cost() {
		return replacemet_cost;
	}
	public void setReplacemet_cost(Double replacemet_cost) {
		this.replacemet_cost = replacemet_cost;
	}
	public Set getSpecial_features() {
		return special_features;
	}
	public void setSpecial_features(Set special_features) {
		this.special_features = special_features;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	private Date last_update ;
}
