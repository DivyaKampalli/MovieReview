package com.movie.review.service;

public interface ReviewService { 
	public int getRating(int movieId,int userId);
	public String getReview(int movieId,int userId);
}
