package com.mix.hr.service;

import com.mix.hr.dto.EmploymentDto;

import java.util.List;
import java.util.Optional;

public interface EmploymentService {
    EmploymentDto createEmployment(EmploymentDto employmentDto);

    Optional<EmploymentDto> getEmployment(String employmentId);

    List<EmploymentDto> getEmploymentsByEmployee(String partyIdTo);

    List<EmploymentDto> getEmploymentsByOrganization(String partyIdFrom);

    void deleteEmployment(String employmentId);
}
