package com.example.movies.entity;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
//Entidad que contiene los atributos que rescatamos desde la API, para uso de thymeleaf
public class Movie {
  private Long id;
  private String title;
  private String overview;
  @JsonProperty("release_date")
  private String releaseDate;
  private Double voteAverage;
  @JsonProperty("backdrop_path")
  private String backdropPath;
  private List<Genre> genres;
  private String tagline;
  @JsonProperty("poster_path")
  private String posterTag;
  private String homepage;
  @JsonProperty("vote_average")
  private String rating;
  
  public Movie() {
	super();
  }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getOverview() {
	return overview;
}

public void setOverview(String overview) {
	this.overview = overview;
}

public String getReleaseDate() {
	return releaseDate;
}

public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}

public Double getVoteAverage() {
	return voteAverage;
}

public void setVoteAverage(Double voteAverage) {
	this.voteAverage = voteAverage;
}

public String getBackdropPath() {
	return backdropPath;
}

public void setBackdropPath(String backdropPath) {
	this.backdropPath = backdropPath;
}

public List<Genre> getGenres() {
	return genres;
}

public void setGenres(List<Genre> genres) {
	this.genres = genres;
}

public String getTagline() {
	return tagline;
}

public void setTagline(String tagline) {
	this.tagline = tagline;
}

public String getPosterTag() {
	return posterTag;
}

public void setPosterTag(String posterTag) {
	this.posterTag = posterTag;
}

public String getHomepage() {
	return homepage;
}

public void setHomepage(String homepage) {
	this.homepage = homepage;
}

public String getRating() {
	return rating;
}

public void setRating(String rating) {
	this.rating = rating;
}
  

  
  
}
