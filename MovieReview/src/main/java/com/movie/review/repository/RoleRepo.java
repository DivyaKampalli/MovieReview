package com.movie.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.review.model.Roles;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Integer> {

}
