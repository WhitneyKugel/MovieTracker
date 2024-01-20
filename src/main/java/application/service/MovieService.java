package application.service;

import application.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovieByTitle(String title);
}
