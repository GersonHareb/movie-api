package com.example.movies.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.movies.entity.Movie;

@Service
public class MovieService {
	private final RestTemplate restTemplate;
	
	public MovieService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	String urApiKey = "";
	String urlRoot = "https://api.themoviedb.org/3/movie/";

	
	public List<Movie> getTopRatedMovies(){

		String url =urlRoot + "top_rated?api_key=" + urApiKey;
		//Se crea una instancia de la clase MovieResponse, la cual con ayuda del restTemplate se deserializa
		MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
		//finalmente se sirve con el metodo que obtiene la lista
		return response.getResults();
	}

	public Movie getMovieDetails(Long id) {
	    String url = urlRoot + id + "?api_key=" + urApiKey;
	    return restTemplate.getForObject(url, Movie.class);
	}

}
