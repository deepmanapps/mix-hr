package com.mix.hr.service;

import com.mix.hr.dto.EmploymentBenefitDto;
import com.mix.hr.dto.PayGradeDto;
import com.mix.hr.dto.PayHistoryDto;
import com.mix.hr.dto.SalaryStepDto;

import java.util.List;

public interface CompensationService {
    // Pay Grades
    PayGradeDto createPayGrade(PayGradeDto payGradeDto);

    List<PayGradeDto> getAllPayGrades();

    // Salary Steps
    SalaryStepDto createSalaryStep(SalaryStepDto salaryStepDto);

    List<SalaryStepDto> getSalaryStepsByPayGrade(String payGradeId);

    // Pay History
    PayHistoryDto recordPayHistory(PayHistoryDto payHistoryDto);

    List<PayHistoryDto> getPayHistoryByEmployee(String partyId);

    // Benefits
    EmploymentBenefitDto assignBenefit(EmploymentBenefitDto benefitDto);

    List<EmploymentBenefitDto> getBenefitsByEmployee(String partyId);
}
