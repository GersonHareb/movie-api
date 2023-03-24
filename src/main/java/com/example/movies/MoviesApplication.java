package com.example.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(MoviesApplication.class, args);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
