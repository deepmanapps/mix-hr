package com.mix.hr.controller;

import com.mix.hr.dto.TerminationReasonDto;
import com.mix.hr.dto.TerminationTypeDto;
import com.mix.hr.service.TerminationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/termination")
@RequiredArgsConstructor
public class TerminationController {

    private final TerminationService terminationService;

    @GetMapping("/types")
    public ResponseEntity<List<TerminationTypeDto>> getAllTerminationTypes() {
        return ResponseEntity.ok(terminationService.getAllTerminationTypes());
    }

    @GetMapping("/reasons")
    public ResponseEntity<List<TerminationReasonDto>> getAllTerminationReasons() {
        return ResponseEntity.ok(terminationService.getAllTerminationReasons());
    }

    @PostMapping("/types")
    public ResponseEntity<TerminationTypeDto> createTerminationType(@RequestBody TerminationTypeDto typeDto) {
        return ResponseEntity.ok(terminationService.createTerminationType(typeDto));
    }

    @PostMapping("/reasons")
    public ResponseEntity<TerminationReasonDto> createTerminationReason(@RequestBody TerminationReasonDto reasonDto) {
        return ResponseEntity.ok(terminationService.createTerminationReason(reasonDto));
    }
}
