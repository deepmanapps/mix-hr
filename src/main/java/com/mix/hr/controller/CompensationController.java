package com.mix.hr.controller;

import com.mix.hr.dto.EmploymentBenefitDto;
import com.mix.hr.dto.PayGradeDto;
import com.mix.hr.dto.PayHistoryDto;
import com.mix.hr.dto.SalaryStepDto;
import com.mix.hr.service.CompensationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compensation")
@RequiredArgsConstructor
public class CompensationController {

    private final CompensationService compensationService;

    // Pay Grades
    @PostMapping("/pay-grades")
    public ResponseEntity<PayGradeDto> createPayGrade(@RequestBody PayGradeDto payGradeDto) {
        return ResponseEntity.ok(compensationService.createPayGrade(payGradeDto));
    }

    @GetMapping("/pay-grades")
    public ResponseEntity<List<PayGradeDto>> getAllPayGrades() {
        return ResponseEntity.ok(compensationService.getAllPayGrades());
    }

    // Salary Steps
    @PostMapping("/salary-steps")
    public ResponseEntity<SalaryStepDto> createSalaryStep(@RequestBody SalaryStepDto salaryStepDto) {
        return ResponseEntity.ok(compensationService.createSalaryStep(salaryStepDto));
    }

    @GetMapping("/salary-steps/{payGradeId}")
    public ResponseEntity<List<SalaryStepDto>> getSalarySteps(@PathVariable String payGradeId) {
        return ResponseEntity.ok(compensationService.getSalaryStepsByPayGrade(payGradeId));
    }

    // Pay History
    @PostMapping("/pay-history")
    public ResponseEntity<PayHistoryDto> recordPayHistory(@RequestBody PayHistoryDto payHistoryDto) {
        return ResponseEntity.ok(compensationService.recordPayHistory(payHistoryDto));
    }

    @GetMapping("/pay-history/employee/{partyId}")
    public ResponseEntity<List<PayHistoryDto>> getPayHistory(@PathVariable String partyId) {
        return ResponseEntity.ok(compensationService.getPayHistoryByEmployee(partyId));
    }

    // Benefits
    @PostMapping("/benefits")
    public ResponseEntity<EmploymentBenefitDto> assignBenefit(@RequestBody EmploymentBenefitDto benefitDto) {
        return ResponseEntity.ok(compensationService.assignBenefit(benefitDto));
    }

    @GetMapping("/benefits/employee/{partyId}")
    public ResponseEntity<List<EmploymentBenefitDto>> getBenefits(@PathVariable String partyId) {
        return ResponseEntity.ok(compensationService.getBenefitsByEmployee(partyId));
    }
}
