package dao;

import model.Movie;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.DBUtility;
import utility.WorkbookUtility;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDaoImpl implements MovieDao{

	final static String DROP_TABLE = "drop table if exists movie";
	final static String CREATE_TABLE = "create table movie (id integer primary key autoincrement, title text, " +
			"plot text, director text, lengthInMinutes integer, yearReleased integer, rating text, genre text, trailer text);";
	final static String SELECT_ALL_FROM_MOVIE = "select * from movie;";

	@Override
	public void populate(String filePath) throws MovieDaoException {

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DBUtility.createConnection();
			statement = connection.createStatement();

			statement.setQueryTimeout(DBUtility.TIMEOUT);

			statement.executeUpdate(DROP_TABLE);
			statement.executeUpdate(CREATE_TABLE);

			// populate the database from WorkbookUtility
			final File inputFile = new File(filePath);
			final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);

			for (final Movie movie : movies) {
				final String insertValues = "insert into movie (title, plot, director, lengthInMinutes, yearReleased, rating," +
						" genre, trailer) " +
						"values ('" + movie.getTitle() + "', '"
						+ movie.getPlot() + "', '"
						+ movie.getDirector() + "', "
						+ movie.getLengthInMinutes() + ", "
						+ movie.getYearReleased() + ", '"
						+ movie.getRating() + "', '"
						+ movie.getGenre() + "', '"
						+ movie.getTrailer() + "');";

				System.out.println(insertValues); // NOTES log the sql that we execute

				statement.executeUpdate(insertValues);
			}

		} catch (ClassNotFoundException | SQLException | IOException | InvalidFormatException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: Unable to populate database.");
		}
	}

	@Override
	public List<Movie> retrieveMovies() throws MovieDaoException {

		// create the list of movies
		final List<Movie> movies = new ArrayList<Movie>();

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DBUtility.createConnection();
			statement = connection.createStatement();

			statement.setQueryTimeout(DBUtility.TIMEOUT);

			// fetch all from movie table
			final ResultSet results = statement.executeQuery(SELECT_ALL_FROM_MOVIE);

			// loop through the result
			while (results.next()) {
				final String title = results.getString("title");
				final String plot = results.getString("plot");
				final String director = results.getString("director");
				final Integer lengthInMinutes = results.getInt("lengthInMinutes");
				final Integer yearReleased = results.getInt("yearReleased");
				final String rating = results.getString("rating");
				final String genre = results.getString("genre");
				final String trailer = results.getString("trailer");

				movies.add(new Movie(title, plot, director, lengthInMinutes, yearReleased, rating, genre, trailer));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: Unable to retrieve list of movies");
		}
		return movies;
	}

	@Override
	public void insertMovie(Movie movie) throws MovieDaoException {

		// set up database connection and statement
		Connection connection = null;
		PreparedStatement insertStatement = null;

		try {
			connection = DBUtility.createConnection();

			final String sqlString = "insert into movie (title, plot, director, lengthInMinutes, yearReleased, rating, " +
					"genre, trailer) values (?, ?, ?, ?, ?, ?, ?, ?);";

			insertStatement = connection.prepareStatement(sqlString);

			insertStatement.setString(1, movie.getTitle());
			insertStatement.setString(2, movie.getPlot());
			insertStatement.setString(3, movie.getDirector());
			insertStatement.setInt(4, movie.getLengthInMinutes());
			insertStatement.setInt(5, movie.getYearReleased());
			insertStatement.setString(6, movie.getRating());
			insertStatement.setString(7, movie.getGenre());
			insertStatement.setString(8, movie.getTrailer());

			insertStatement.setQueryTimeout(DBUtility.TIMEOUT);

			insertStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: unable to insert movie.");
		}

	}
}
