package controller;

import comparator.*;
import dao.MovieDao;
import dao.MovieDaoException;
import dao.MovieDaoImpl;
import model.Movie;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.WorkbookUtility;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "ViewAllServlet", urlPatterns = "/ViewAll")
public class ViewAllServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  String target = "/view-all.jsp";
    //get access to spreadsheet
    //final String filePath = getServletContext().getRealPath(WorkbookUtility.INPUT_FILE);
    //final File inputFile = new File(filePath);

    //Fetch information and use it to populate the model
      try {
      	//final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);

	      final MovieDao movieDao = new MovieDaoImpl();
	      final List<Movie> movies = movieDao.retrieveMovies();

	      String sortType = request.getParameter("sortType");

	      if(null != sortType && sortType.equals("title")) {
		      Collections.sort(movies, new TitleComparator());
	      } else if(null != sortType && sortType.equals("director")) {
	      	Collections.sort(movies, new DirectorComparator());
	      } else if(null != sortType && sortType.equals("yearReleased")) {
	      	Collections.sort(movies, new YearComparator());
	      } else if (null != sortType && sortType.equals("lengthInMinutes")) {
	      	Collections.sort(movies, new LengthComparator());
	      } else if (null != sortType && sortType.equals("mostRecent")) {
	      	Collections.sort(movies, new ReverseYearComparator());
	      }

      	//attach the model to the request
	      request.setAttribute("movies", movies);
      } catch (MovieDaoException e) {
      	e.printStackTrace();
      }

    //forward the request to the value.
    getServletContext().getRequestDispatcher(target).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
	}
}
