package service.comparator;

import application.entity.Movie;

import java.util.Comparator;

public class LengthComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie movie1, Movie movie2) {
		return movie1.getLengthInMinutes().compareTo(movie2.getLengthInMinutes());
	}
}


