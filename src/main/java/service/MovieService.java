package service;

import model.Movie;
import repository.MovieDaoException;

import java.util.List;

public class MovieService {

    List<Movie> retrieveMovies() throws MovieDaoException;


}
