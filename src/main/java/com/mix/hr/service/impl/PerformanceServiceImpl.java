package com.mix.hr.service.impl;

import com.mix.hr.dto.PerfReviewDto;
import com.mix.hr.dto.PerfReviewItemDto;
import com.mix.hr.dto.PersonTrainingDto;
import com.mix.hr.entity.PerfReview;
import com.mix.hr.entity.PerfReviewItem;
import com.mix.hr.entity.PersonTraining;
import com.mix.hr.mapper.PerformanceMapper;
import com.mix.hr.repository.PerfReviewItemRepository;
import com.mix.hr.repository.PerfReviewRepository;
import com.mix.hr.repository.PersonTrainingRepository;
import com.mix.hr.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PerformanceServiceImpl implements PerformanceService {

    private final PersonTrainingRepository personTrainingRepository;
    private final PerfReviewRepository perfReviewRepository;
    private final PerfReviewItemRepository perfReviewItemRepository;
    private final PerformanceMapper performanceMapper;

    @Override
    public PersonTrainingDto assignTraining(PersonTrainingDto trainingDto) {
        PersonTraining training = performanceMapper.toEntity(trainingDto);
        return performanceMapper.toDto(personTrainingRepository.save(training));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonTrainingDto> getTrainingByEmployee(String partyId) {
        return personTrainingRepository.findByPartyId(partyId).stream()
                .map(performanceMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PerfReviewDto createReview(PerfReviewDto reviewDto) {
        PerfReview review = performanceMapper.toEntity(reviewDto);
        return performanceMapper.toDto(perfReviewRepository.save(review));
    }

    @Override
    @Transactional(readOnly = true)
    public PerfReviewDto getReview(String reviewId) {
        return perfReviewRepository.findById(reviewId)
                .map(performanceMapper::toDto)
                .orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PerfReviewDto> getReviewsByEmployee(String partyId) {
        return perfReviewRepository.findByEmployeePartyId(partyId).stream()
                .map(performanceMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<PerfReviewDto> getReviewsByManager(String managerPartyId) {
        return perfReviewRepository.findByManagerPartyId(managerPartyId).stream()
                .map(performanceMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PerfReviewItemDto addReviewItem(PerfReviewItemDto itemDto) {
        PerfReviewItem item = performanceMapper.toEntity(itemDto);
        return performanceMapper.toDto(perfReviewItemRepository.save(item));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PerfReviewItemDto> getReviewItems(String reviewId) {
        return perfReviewItemRepository.findByPerfReviewId(reviewId).stream()
                .map(performanceMapper::toDto)
                .collect(Collectors.toList());
    }
}
