package com.dao;

import java.util.List;

import com.pojo.Movie;

public interface MovieDao 
{
	void addMovie(Movie mov);
	void updateMovie(Movie mov);
	void deleteMovie(Movie mov);
	
	List<Movie>showList();
	
	Movie searchEmployeeByName(String name);



}
