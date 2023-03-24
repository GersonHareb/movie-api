
package com.example.movies.controller;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.movies.entity.Movie;
import com.example.movies.service.MovieService;


@Controller
public class MovieController {
//controlador que maneja la peticion, desde aca habilitamos los atributos para que puedan ser gesrtionados por thymeleaf
    private final MovieService movieService;
    //este constructor de MovieControllerinyecta una instancia de la clase MovieService, es necesario para obtener la lista de peliculas
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
    	//llama al metodo de Movieservice que devuelve la lista
      List<Movie> movies = movieService.getTopRatedMovies();
      //Se agrega la lista, el primer argumento es el nombre que se le otorga para agregarlo al modelo de Spring y asi para ser servido por Thymeleaf,
      //el segundo argumento es la lista
      model.addAttribute("movies", movies);
      //pequeño forEach para ver los resultados en consola
      for (Movie movie : movies) {
        System.out.println("ID: " + movie.getId() + ", Título: " + movie.getTitle() + ", Descripción: " + movie.getOverview() + ", Fecha de lanzamiento: " + movie.getReleaseDate() + ", Puntuación: " + movie.getVoteAverage() + ", Ruta de imagen: " + movie.getBackdropPath());
      }
      return "movies";
    }

    @GetMapping("/movies/{id}")
    public String getMovieDetails(@PathVariable("id") Long id, Model model) {
        Movie movie = movieService.getMovieDetails(id);
        
        float rating = Float.parseFloat(movie.getRating());
        DecimalFormat df = new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
        String formattedRating = df.format(rating);
        
        
        model.addAttribute("movie", movie);
        model.addAttribute("formattedRating", formattedRating);
        return "movie-details";
    }

}
