package com.mix.hr.controller;

import com.mix.hr.dto.PerfReviewDto;
import com.mix.hr.dto.PerfReviewItemDto;
import com.mix.hr.dto.PersonTrainingDto;
import com.mix.hr.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/performance")
@RequiredArgsConstructor
public class PerformanceController {

    private final PerformanceService performanceService;

    // Training
    @PostMapping("/training")
    public ResponseEntity<PersonTrainingDto> assignTraining(@RequestBody PersonTrainingDto trainingDto) {
        return ResponseEntity.ok(performanceService.assignTraining(trainingDto));
    }

    @GetMapping("/training/employee/{partyId}")
    public ResponseEntity<List<PersonTrainingDto>> getTraining(@PathVariable String partyId) {
        return ResponseEntity.ok(performanceService.getTrainingByEmployee(partyId));
    }

    // Reviews
    @PostMapping("/reviews")
    public ResponseEntity<PerfReviewDto> createReview(@RequestBody PerfReviewDto reviewDto) {
        return ResponseEntity.ok(performanceService.createReview(reviewDto));
    }

    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<PerfReviewDto> getReview(@PathVariable String reviewId) {
        PerfReviewDto review = performanceService.getReview(reviewId);
        return review != null ? ResponseEntity.ok(review) : ResponseEntity.notFound().build();
    }

    @GetMapping("/reviews/employee/{partyId}")
    public ResponseEntity<List<PerfReviewDto>> getEmployeeReviews(@PathVariable String partyId) {
        return ResponseEntity.ok(performanceService.getReviewsByEmployee(partyId));
    }

    @GetMapping("/reviews/manager/{managerId}")
    public ResponseEntity<List<PerfReviewDto>> getManagerReviews(@PathVariable String managerId) {
        return ResponseEntity.ok(performanceService.getReviewsByManager(managerId));
    }

    // Review Items
    @PostMapping("/reviews/items")
    public ResponseEntity<PerfReviewItemDto> addReviewItem(@RequestBody PerfReviewItemDto itemDto) {
        return ResponseEntity.ok(performanceService.addReviewItem(itemDto));
    }

    @GetMapping("/reviews/{reviewId}/items")
    public ResponseEntity<List<PerfReviewItemDto>> getReviewItems(@PathVariable String reviewId) {
        return ResponseEntity.ok(performanceService.getReviewItems(reviewId));
    }
}
