package controller;

import com.google.common.base.Strings;
import dao.MovieDao;
import dao.MovieDaoException;
import dao.MovieDaoImpl;
import model.Movie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddNewMovieServlet", urlPatterns = "/AddNewMovie")
public class AddNewMovieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// get the information submitted by the user
		try {
			final String title = request.getParameter("title");
			final String plot = request.getParameter("plot");
			final String director = request.getParameter("director");
			final String lengthString = request.getParameter("lengthInMinutes");
			final String yearString = request.getParameter("yearReleased");
			final String rating = request.getParameter("rating");
			final String genre = request.getParameter("genre");
			final String trailer = request.getParameter("trailer").split("v=")[1].substring(0, 11);

			if(Strings.isNullOrEmpty(title)
					|| Strings.isNullOrEmpty(plot)
					|| Strings.isNullOrEmpty(director)
					|| Strings.isNullOrEmpty(lengthString)
					|| Strings.isNullOrEmpty(yearString)
					|| Strings.isNullOrEmpty(rating)
					|| Strings.isNullOrEmpty(genre)
					|| Strings.isNullOrEmpty(trailer)) {

				// User did not submit all the required information
				request.setAttribute("message", "Please fill out all fields before submitting.");
			} else {

				// user submitted all required data
				final int length = Integer.parseInt(lengthString);
				final int year = Integer.parseInt(yearString);

				final MovieDao movieDao = new MovieDaoImpl();

				// create movie object using submitted info
				final Movie movie = new Movie(title, plot, director, length, year, rating, genre, trailer);

				// insert that movie object into the db using movieDao
				movieDao.insertMovie(movie);
				request.setAttribute("message", "The movie was added.");
			}
		} catch (MovieDaoException e) {
			e.printStackTrace();
			request.setAttribute("message", e.getMessage());
		}

			getServletContext().getRequestDispatcher("/add-movie.jsp").forward(request, response);
	}
}
