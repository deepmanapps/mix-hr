package com.mix.hr.service;

import com.mix.hr.dto.PerfReviewDto;
import com.mix.hr.dto.PerfReviewItemDto;
import com.mix.hr.dto.PersonTrainingDto;

import java.util.List;

public interface PerformanceService {
    // Training
    PersonTrainingDto assignTraining(PersonTrainingDto trainingDto);

    List<PersonTrainingDto> getTrainingByEmployee(String partyId);

    // Performance Reviews
    PerfReviewDto createReview(PerfReviewDto reviewDto);

    PerfReviewDto getReview(String reviewId);

    List<PerfReviewDto> getReviewsByEmployee(String partyId);

    List<PerfReviewDto> getReviewsByManager(String managerPartyId);

    // Review Items
    PerfReviewItemDto addReviewItem(PerfReviewItemDto itemDto);

    List<PerfReviewItemDto> getReviewItems(String reviewId);
}
