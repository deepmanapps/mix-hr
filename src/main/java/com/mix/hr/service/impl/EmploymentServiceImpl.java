package com.mix.hr.service.impl;

import com.mix.hr.dto.EmploymentDto;
import com.mix.hr.entity.Employment;
import com.mix.hr.mapper.EmploymentMapper;
import com.mix.hr.repository.EmploymentRepository;
import com.mix.hr.service.EmploymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class EmploymentServiceImpl implements EmploymentService {

    private final EmploymentRepository employmentRepository;
    private final EmploymentMapper employmentMapper;

    @Override
    public EmploymentDto createEmployment(EmploymentDto employmentDto) {
        Employment employment = employmentMapper.toEntity(employmentDto);
        return employmentMapper.toDto(employmentRepository.save(employment));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EmploymentDto> getEmployment(String employmentId) {
        return employmentRepository.findById(employmentId).map(employmentMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmploymentDto> getEmploymentsByEmployee(String partyIdTo) {
        return employmentRepository.findByPartyIdTo(partyIdTo).stream()
                .map(employmentMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmploymentDto> getEmploymentsByOrganization(String partyIdFrom) {
        return employmentRepository.findByPartyIdFrom(partyIdFrom).stream()
                .map(employmentMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteEmployment(String employmentId) {
        employmentRepository.deleteById(employmentId);
    }
}
