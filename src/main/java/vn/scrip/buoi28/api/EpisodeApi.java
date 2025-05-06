package vn.scrip.buoi28.api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.scrip.buoi28.model.request.CreateEpisodeRequest;
import vn.scrip.buoi28.model.request.UpdateEpisodeRequest;

import vn.scrip.buoi28.service.EpisodeService;
@RestController
@RequestMapping("/api/episodes")
@RequiredArgsConstructor
public class EpisodeApi {
    private final EpisodeService episodeService;
    // Tạo mới tập phim
    @PostMapping
    public ResponseEntity<?> createEpisode(@RequestBody CreateEpisodeRequest request) {

        // Gọi service để tạo tập phim mới
        return ResponseEntity.ok(episodeService.createEpisode(request));
    }
    // Cập nhật tập phim theo ID
    @PutMapping("/{id}")
    public ResponseEntity<?> updateEpisode(@PathVariable Integer id, @RequestBody UpdateEpisodeRequest request) {
        // Gọi service để cập nhật tập phim
        return ResponseEntity.ok(episodeService.updateEpisode(id, request));
    }
}

