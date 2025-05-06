package vn.scrip.buoi28.service;
import vn.scrip.buoi28.entity.User;
import vn.scrip.buoi28.entity.Movie;
import vn.scrip.buoi28.entity.FavoriteMovie;
import vn.scrip.buoi28.repository.FavoriteMovieRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FavoriteMovieService {

    private final FavoriteMovieRepository favoriteMovieRepository;
    public void toggleFavorite(User user, Movie movie) {
        var existing = favoriteMovieRepository.findByUserAndMovie(user, movie);
        if (existing.isPresent()) {
            favoriteMovieRepository.delete(existing.get());
        } else {
            FavoriteMovie favorite = FavoriteMovie.builder()
                    .user(user)
                    .movie(movie)
                    .build();
            favoriteMovieRepository.save(favorite);
        }
    }

    public List<FavoriteMovie> getFavoritesByUser(User user) {
        return favoriteMovieRepository.findByUser(user);
    }

    public boolean isMovieFavorited(User user, Movie movie) {
        return favoriteMovieRepository.findByUserAndMovie(user, movie).isPresent();
    }
}

