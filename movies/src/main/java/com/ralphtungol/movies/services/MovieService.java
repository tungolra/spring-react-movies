package com.ralphtungol.movies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ralphtungol.movies.models.Movie;
import com.ralphtungol.movies.repositories.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // lets framework know to instantiate this class
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return  movieRepository.findMovieByImdbId(imdbId);
    }
}
