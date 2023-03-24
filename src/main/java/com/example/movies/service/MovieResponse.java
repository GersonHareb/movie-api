package com.example.movies.service;

import java.util.List;

import com.example.movies.entity.Movie;

public class MovieResponse {
//Esta clase representa la respuesta de la API
    private List<Movie> results;
//provee el metodo para obtener una lista de peliculas
    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
    
}