package com.mix.hr.controller;

import com.mix.hr.dto.EmplPositionDto;
import com.mix.hr.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
@RequiredArgsConstructor
public class PositionController {

    private final PositionService positionService;

    @PostMapping
    public ResponseEntity<EmplPositionDto> createPosition(@RequestBody EmplPositionDto positionDto) {
        return ResponseEntity.ok(positionService.createPosition(positionDto));
    }

    @GetMapping("/{positionId}")
    public ResponseEntity<EmplPositionDto> getPosition(@PathVariable String positionId) {
        return positionService.getPosition(positionId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<EmplPositionDto>> getAllPositions() {
        return ResponseEntity.ok(positionService.getAllPositions());
    }

    @DeleteMapping("/{positionId}")
    public ResponseEntity<Void> deletePosition(@PathVariable String positionId) {
        positionService.deletePosition(positionId);
        return ResponseEntity.noContent().build();
    }
}
