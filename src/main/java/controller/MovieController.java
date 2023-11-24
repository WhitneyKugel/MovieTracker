package controller;

import model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/movies")
public class MovieController {


    @GetMapping("/title")
    public Movie getMovieByTitle(String title) {
        return null;
    }


}
