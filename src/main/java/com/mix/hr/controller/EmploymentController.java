package com.mix.hr.controller;

import com.mix.hr.dto.EmploymentDto;
import com.mix.hr.service.EmploymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employments")
@RequiredArgsConstructor
public class EmploymentController {

    private final EmploymentService employmentService;

    @PostMapping
    public ResponseEntity<EmploymentDto> createEmployment(@RequestBody EmploymentDto employmentDto) {
        return ResponseEntity.ok(employmentService.createEmployment(employmentDto));
    }

    @GetMapping("/{employmentId}")
    public ResponseEntity<EmploymentDto> getEmployment(@PathVariable String employmentId) {
        return employmentService.getEmployment(employmentId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/employee/{partyId}")
    public ResponseEntity<List<EmploymentDto>> getEmploymentsByEmployee(@PathVariable String partyId) {
        return ResponseEntity.ok(employmentService.getEmploymentsByEmployee(partyId));
    }

    @DeleteMapping("/{employmentId}")
    public ResponseEntity<Void> deleteEmployment(@PathVariable String employmentId) {
        employmentService.deleteEmployment(employmentId);
        return ResponseEntity.noContent().build();
    }
}
