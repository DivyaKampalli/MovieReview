package com.movie.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories(basePackages = "com.movie.review")
public class MovieReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewApplication.class, args);
		System.out.println("application in running");
	}
}



	


