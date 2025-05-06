package vn.scrip.buoi28.repository;
import vn.scrip.buoi28.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostRepository extends JpaRepository<Post, Integer> {
}