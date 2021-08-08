package model;

import java.io.Serializable;

public class Movie implements Serializable {

	private String title;
	private String plot;
	private String director;
	private Integer lengthInMinutes;
	private Integer yearReleased;
	private String rating;
	private String genre;
	private String trailer;

	public Movie() {
	}

	public Movie(String title, String plot, String director, int lengthInMinutes, int yearReleased, String rating,
	             String genre, String trailer) {
		this.title = title;
		this.plot = plot;
		this.director = director;
		this.lengthInMinutes = lengthInMinutes;
		this.yearReleased = yearReleased;
		this.rating = rating;
		this.genre = genre;
		this.trailer = trailer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(Integer lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}

	public Integer getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(Integer yearReleased) {
		this.yearReleased = yearReleased;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"title='" + title + '\'' +
				", plot='" + plot + '\'' +
				", director='" + director + '\'' +
				", lengthInMinutes=" + lengthInMinutes +
				", yearReleased=" + yearReleased +
				", rating='" + rating + '\'' +
				", genre='" + genre + '\'' +
				", trailer='" + trailer + '\'' +
				'}';
	}
}
