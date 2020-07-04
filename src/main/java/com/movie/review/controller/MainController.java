package com.movie.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movie.review.model.Movie;
import com.movie.review.model.Review;
import com.movie.review.service.MovieService;
import com.movie.review.service.ReviewService;


@Controller
public class MainController {
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ReviewService reviewService;

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public List<Movie> home() { 
		return movieService.getAllMovies();	
	}
		
	@PostMapping(value="/movie/submit")
	public Movie submitMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}
	
	@PostMapping(value="/review/submit")
	public Review submitReview(@RequestBody Review review) {
		return reviewService.saveReview(review);
	}
}
