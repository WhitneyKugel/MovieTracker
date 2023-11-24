package repository;

import model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

    void populate(String filePath) throws MovieDaoException;

    List<Movie> retrieveMovies() throws MovieDaoException;

    void insertMovie(Movie movie) throws MovieDaoException;

}
