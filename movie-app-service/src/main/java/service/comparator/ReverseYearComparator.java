package service.comparator;

import application.entity.Movie;

import java.util.Comparator;

public class ReverseYearComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie movie1, Movie movie2) {
		return movie2.getYearReleased().compareTo(movie1.getYearReleased());
	}
}