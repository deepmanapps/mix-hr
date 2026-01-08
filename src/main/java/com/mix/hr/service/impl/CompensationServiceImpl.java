package com.mix.hr.service.impl;

import com.mix.hr.dto.EmploymentBenefitDto;
import com.mix.hr.dto.PayGradeDto;
import com.mix.hr.dto.PayHistoryDto;
import com.mix.hr.dto.SalaryStepDto;
import com.mix.hr.entity.EmploymentBenefit;
import com.mix.hr.entity.PayGrade;
import com.mix.hr.entity.PayHistory;
import com.mix.hr.entity.SalaryStep;
import com.mix.hr.mapper.CompensationMapper;
import com.mix.hr.repository.EmploymentBenefitRepository;
import com.mix.hr.repository.PayGradeRepository;
import com.mix.hr.repository.PayHistoryRepository;
import com.mix.hr.repository.SalaryStepRepository;
import com.mix.hr.service.CompensationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class CompensationServiceImpl implements CompensationService {

    private final PayGradeRepository payGradeRepository;
    private final SalaryStepRepository salaryStepRepository;
    private final PayHistoryRepository payHistoryRepository;
    private final EmploymentBenefitRepository employmentBenefitRepository;
    private final CompensationMapper compensationMapper;

    @Override
    public PayGradeDto createPayGrade(PayGradeDto payGradeDto) {
        PayGrade payGrade = compensationMapper.toEntity(payGradeDto);
        return compensationMapper.toDto(payGradeRepository.save(payGrade));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PayGradeDto> getAllPayGrades() {
        return payGradeRepository.findAll().stream()
                .map(compensationMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public SalaryStepDto createSalaryStep(SalaryStepDto salaryStepDto) {
        SalaryStep salaryStep = compensationMapper.toEntity(salaryStepDto);
        return compensationMapper.toDto(salaryStepRepository.save(salaryStep));
    }

    @Override
    @Transactional(readOnly = true)
    public List<SalaryStepDto> getSalaryStepsByPayGrade(String payGradeId) {
        return salaryStepRepository.findByPayGradeId(payGradeId).stream()
                .map(compensationMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PayHistoryDto recordPayHistory(PayHistoryDto payHistoryDto) {
        PayHistory payHistory = compensationMapper.toEntity(payHistoryDto);
        return compensationMapper.toDto(payHistoryRepository.save(payHistory));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PayHistoryDto> getPayHistoryByEmployee(String partyId) {
        return payHistoryRepository.findByPartyId(partyId).stream()
                .map(compensationMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmploymentBenefitDto assignBenefit(EmploymentBenefitDto benefitDto) {
        EmploymentBenefit benefit = compensationMapper.toEntity(benefitDto);
        return compensationMapper.toDto(employmentBenefitRepository.save(benefit));
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmploymentBenefitDto> getBenefitsByEmployee(String partyId) {
        return employmentBenefitRepository.findByPartyIdTo(partyId).stream()
                .map(compensationMapper::toDto)
                .collect(Collectors.toList());
    }
}
