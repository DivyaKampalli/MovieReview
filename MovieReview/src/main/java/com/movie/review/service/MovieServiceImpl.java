package com.movie.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movie.review.model.Movie;
import com.movie.review.repository.MovieRepo;

@Component
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepo movieRepo;
	
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	@Override
	public Movie getMovieById(int id) {
		// TODO Auto-generated method stub
		return movieRepo.getOne(id);
	}

	@Override
	public Movie createMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepo.save(movie);
	}

	@Override
	public void deleteMovieById(Movie movie) {
		// TODO Auto-generated method stub
		 movieRepo.delete(movie);
	}

	@Override
	public Movie updateMovieById(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepo.save(movie);
	}

}
