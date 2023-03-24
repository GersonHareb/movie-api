package com.example.movies.service;

import java.util.List;

import com.example.movies.entity.Genre;

public class GenreResponse {
    private List<Genre> genres;

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}