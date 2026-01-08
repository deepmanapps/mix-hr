package com.mix.hr.service.impl;

import com.mix.hr.dto.EmplPositionDto;
import com.mix.hr.entity.EmplPosition;
import com.mix.hr.mapper.EmploymentMapper;
import com.mix.hr.repository.EmplPositionRepository;
import com.mix.hr.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final EmplPositionRepository emplPositionRepository;
    private final EmploymentMapper employmentMapper;

    @Override
    public EmplPositionDto createPosition(EmplPositionDto positionDto) {
        EmplPosition position = employmentMapper.toEntity(positionDto);
        return employmentMapper.toDto(emplPositionRepository.save(position));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EmplPositionDto> getPosition(String positionId) {
        return emplPositionRepository.findById(positionId)
                .map(employmentMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmplPositionDto> getAllPositions() {
        return emplPositionRepository.findAll().stream()
                .map(employmentMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deletePosition(String positionId) {
        emplPositionRepository.deleteById(positionId);
    }
}
