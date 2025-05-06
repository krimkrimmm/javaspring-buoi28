package vn.scrip.buoi28.repository;

import vn.scrip.buoi28.entity.FavoriteMovie;
import vn.scrip.buoi28.entity.User;
import vn.scrip.buoi28.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FavoriteMovieRepository extends JpaRepository<FavoriteMovie, Integer> {
    List<FavoriteMovie> findByUser(User user);
    Optional<FavoriteMovie> findByUserAndMovie(User user, Movie movie);
}





