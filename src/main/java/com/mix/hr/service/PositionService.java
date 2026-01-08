package com.mix.hr.service;

import com.mix.hr.dto.EmplPositionDto;
import java.util.List;
import java.util.Optional;

public interface PositionService {
    EmplPositionDto createPosition(EmplPositionDto positionDto);

    Optional<EmplPositionDto> getPosition(String positionId);

    List<EmplPositionDto> getAllPositions();

    void deletePosition(String positionId);
}
