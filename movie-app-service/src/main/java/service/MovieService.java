package service;

import application.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovieByTitle(String title);
}
