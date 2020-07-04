package com.movie.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.movie.review.model.Review;
import com.movie.review.repository.ReviewRepo;
 
@Component
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewRepo reviewRepo;
	
	
	

	@Override
	public Review saveReview(Review review) {
		// TODO Auto-generated method stub
		return reviewRepo.save(review);
	}

	@Override
	public Review updateReview(Review review) {
		// TODO Auto-generated method stub
		return reviewRepo.save(review);
	}


 
}
