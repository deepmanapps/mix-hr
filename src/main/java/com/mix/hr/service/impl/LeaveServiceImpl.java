package com.mix.hr.service.impl;

import com.mix.hr.dto.EmplLeaveDto;
import com.mix.hr.entity.EmplLeave;
import com.mix.hr.mapper.ResourceMapper;
import com.mix.hr.repository.EmplLeaveRepository;
import com.mix.hr.service.LeaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService {

    private final EmplLeaveRepository emplLeaveRepository;
    private final ResourceMapper resourceMapper;

    @Override
    public EmplLeaveDto createLeave(EmplLeaveDto leaveDto) {
        EmplLeave leave = resourceMapper.toEntity(leaveDto);
        return resourceMapper.toDto(emplLeaveRepository.save(leave));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EmplLeaveDto> getLeave(String leaveId) {
        return emplLeaveRepository.findById(leaveId)
                .map(resourceMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmplLeaveDto> getLeavesByEmployee(String partyId) {
        return emplLeaveRepository.findByPartyId(partyId).stream()
                .map(resourceMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteLeave(String leaveId) {
        emplLeaveRepository.deleteById(leaveId);
    }
}
