package vn.scrip.buoi28.repository;
import vn.scrip.buoi28.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HistoryRepository extends JpaRepository<History, Integer> {
}