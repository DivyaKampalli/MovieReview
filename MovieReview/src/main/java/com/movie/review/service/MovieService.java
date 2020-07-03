package com.movie.review.service;

import java.util.List;

import com.movie.review.model.Movie;
//
public interface MovieService { 
	public List<Movie> getAllMovies();
	public Movie getMovieById(int id);
	public Movie createMovie(Movie movie);
	public void deleteMovieById(Movie movie);
	public Movie updateMovieById(Movie movie);
}
