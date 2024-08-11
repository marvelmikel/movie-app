package com.marvel.movie_app_api.movie.service;

import com.marvel.movie_app_api.movie.model.Movie;
import com.marvel.movie_app_api.movie.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieById(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
