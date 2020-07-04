package com.movie.review.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	//
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int userid;  
	
	private int movieid;
	 
	private int rating;
	
	private String reviews;
	
	public Review() {
		super();
	}

	public Review(int id, int userid, int movieid, int rating, String reviews) {
		super();
		this.id = id;
		this.userid = userid;
		this.movieid = movieid;
		this.rating = rating;
		this.reviews = reviews;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	
}
