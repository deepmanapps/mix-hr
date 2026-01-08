package com.mix.hr.service.impl;

import com.mix.hr.dto.TerminationReasonDto;
import com.mix.hr.dto.TerminationTypeDto;
import com.mix.hr.entity.TerminationReason;
import com.mix.hr.entity.TerminationType;
import com.mix.hr.mapper.TerminationMapper;
import com.mix.hr.repository.TerminationReasonRepository;
import com.mix.hr.repository.TerminationTypeRepository;
import com.mix.hr.service.TerminationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class TerminationServiceImpl implements TerminationService {

    private final TerminationTypeRepository terminationTypeRepository;
    private final TerminationReasonRepository terminationReasonRepository;
    private final TerminationMapper terminationMapper;

    @Override
    @Transactional(readOnly = true)
    public List<TerminationTypeDto> getAllTerminationTypes() {
        return terminationTypeRepository.findAll().stream()
                .map(terminationMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<TerminationReasonDto> getAllTerminationReasons() {
        return terminationReasonRepository.findAll().stream()
                .map(terminationMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TerminationTypeDto createTerminationType(TerminationTypeDto typeDto) {
        TerminationType type = terminationMapper.toEntity(typeDto);
        return terminationMapper.toDto(terminationTypeRepository.save(type));
    }

    @Override
    public TerminationReasonDto createTerminationReason(TerminationReasonDto reasonDto) {
        TerminationReason reason = terminationMapper.toEntity(reasonDto);
        return terminationMapper.toDto(terminationReasonRepository.save(reason));
    }
}
