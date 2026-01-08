package com.mix.hr.mapper;

import com.mix.hr.dto.PerfReviewDto;
import com.mix.hr.dto.PerfReviewItemDto;
import com.mix.hr.dto.PersonTrainingDto;
import com.mix.hr.dto.TrainingClassTypeDto;
import com.mix.hr.entity.PerfReview;
import com.mix.hr.entity.PerfReviewItem;
import com.mix.hr.entity.PersonTraining;
import com.mix.hr.entity.TrainingClassType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PerformanceMapper {
    PerformanceMapper INSTANCE = Mappers.getMapper(PerformanceMapper.class);

    TrainingClassTypeDto toDto(TrainingClassType trainingClassType);

    TrainingClassType toEntity(TrainingClassTypeDto trainingClassTypeDto);

    PersonTrainingDto toDto(PersonTraining personTraining);

    PersonTraining toEntity(PersonTrainingDto personTrainingDto);

    PerfReviewDto toDto(PerfReview perfReview);

    PerfReview toEntity(PerfReviewDto perfReviewDto);

    PerfReviewItemDto toDto(PerfReviewItem perfReviewItem);

    PerfReviewItem toEntity(PerfReviewItemDto perfReviewItemDto);
}
