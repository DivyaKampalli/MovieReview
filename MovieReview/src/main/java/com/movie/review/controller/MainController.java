package com.movie.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.review.model.Movie;
import com.movie.review.service.MovieService;

@RestController
public class MainController {
	
	@Autowired//
	private MovieService movieService;
	

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public List<Movie> home() { 
		return movieService.getAllMovies();
		//return "index";
	}
	
	
}
