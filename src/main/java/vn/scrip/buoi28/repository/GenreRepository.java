package vn.scrip.buoi28.repository;
import vn.scrip.buoi28.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}