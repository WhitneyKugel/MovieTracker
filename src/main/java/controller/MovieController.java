package controller;

import lombok.RequiredArgsConstructor;
import model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MovieService;

import java.util.List;

@RestController("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;


    @GetMapping()
    public List<Movie> getAllMovies() {

        List<Movie> movies = movieService.getAllMovies();

        return movies;
    }

    @GetMapping("/title")
    public Movie getMovieByTitle(String title) {
        return null;
    }


}
