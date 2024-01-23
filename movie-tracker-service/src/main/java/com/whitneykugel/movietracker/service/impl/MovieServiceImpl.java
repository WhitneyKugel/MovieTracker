package com.whitneykugel.movietracker.service.impl;

import lombok.RequiredArgsConstructor;
import com.whitneykugel.movietracker.service.MovieService;
import com.whitneykugel.movietracker.data.entity.Movie;


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