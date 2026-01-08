package com.mix.hr.mapper;

import com.mix.hr.dto.EmploymentBenefitDto;
import com.mix.hr.dto.PayGradeDto;
import com.mix.hr.dto.PayHistoryDto;
import com.mix.hr.dto.SalaryStepDto;
import com.mix.hr.entity.EmploymentBenefit;
import com.mix.hr.entity.PayGrade;
import com.mix.hr.entity.PayHistory;
import com.mix.hr.entity.SalaryStep;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompensationMapper {
    CompensationMapper INSTANCE = Mappers.getMapper(CompensationMapper.class);

    PayGradeDto toDto(PayGrade payGrade);

    PayGrade toEntity(PayGradeDto payGradeDto);

    SalaryStepDto toDto(SalaryStep salaryStep);

    SalaryStep toEntity(SalaryStepDto salaryStepDto);

    PayHistoryDto toDto(PayHistory payHistory);

    PayHistory toEntity(PayHistoryDto payHistoryDto);

    EmploymentBenefitDto toDto(EmploymentBenefit employmentBenefit);

    EmploymentBenefit toEntity(EmploymentBenefitDto employmentBenefitDto);
}
