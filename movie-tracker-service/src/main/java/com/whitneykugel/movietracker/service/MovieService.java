package com.whitneykugel.movietracker.service;

import com.whitneykugel.movietracker.data.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

	List<Movie> getAllMovies();

	Movie getMovieByTitle(String title);
}