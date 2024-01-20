package application.service.impl;

import lombok.RequiredArgsConstructor;
import application.model.Movie;
import application.repository.MovieRepository;
import application.service.MovieService;

import java.util.List;

@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieByTitle(String title) {
        return movieRepository.getById(title);
    }
}
