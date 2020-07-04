package com.movie.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.review.model.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
	
}
