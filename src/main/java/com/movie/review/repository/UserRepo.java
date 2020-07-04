package com.movie.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.review.model.User;
//
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
}


