package controller;

import repository.MovieDaoException;
import repository.MovieDaoImpl;
import model.Movie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "SearchTitleServlet", urlPatterns = "/SearchTitle")
public class SearchTitleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			String filterStringTitle = request.getParameter("title").toLowerCase();
			final MovieDao movieDao = new MovieDaoImpl();
			final List<Movie> movies = movieDao.retrieveMovies();
			final List<Movie> filtered =
					movies.stream().filter( (Movie m) -> m.getTitle().toLowerCase().contains(filterStringTitle)).collect(Collectors.toList());

			request.setAttribute("movies", filtered);

		} catch (MovieDaoException e) {
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher("/view-all.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
