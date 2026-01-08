package com.mix.hr.service;

import com.mix.hr.dto.EmplLeaveDto;
import java.util.List;
import java.util.Optional;

public interface LeaveService {
    EmplLeaveDto createLeave(EmplLeaveDto leaveDto);

    Optional<EmplLeaveDto> getLeave(String leaveId);

    List<EmplLeaveDto> getLeavesByEmployee(String partyId);

    void deleteLeave(String leaveId);
}
