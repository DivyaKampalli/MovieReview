package com.movie.review.service;

import com.movie.review.model.Review;

public interface ReviewService { 
	
	public Review saveReview(Review review);
	public Review updateReview(Review review);

}


