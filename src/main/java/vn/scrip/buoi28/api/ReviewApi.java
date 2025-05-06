package vn.scrip.buoi28.api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.scrip.buoi28.model.request.CreateReviewRequest;
import vn.scrip.buoi28.model.request.UpdateReviewRequest;

import vn.scrip.buoi28.service.ReviewService;
@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewApi {

    private final ReviewService reviewService;
    @PostMapping
    public ResponseEntity<?> createReview(@RequestBody CreateReviewRequest request) {

        return ResponseEntity.ok(reviewService.createReview(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateReview(@PathVariable Integer id, @RequestBody UpdateReviewRequest request) {
        return ResponseEntity.ok(reviewService.updateReview(id, request));
    }
}




