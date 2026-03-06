package com.example.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.Repository.MovieRepository;
import com.example.model.Movie;

@Service
public class MovieService {

    private MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }

    public Movie getMovieById(Long id) {  
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    public void deleteMovie(Long id) { 
        repository.deleteById(id);
    }
}