package com.mix.hr.controller;

import com.mix.hr.dto.EmplLeaveDto;
import com.mix.hr.service.LeaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
@RequiredArgsConstructor
public class LeaveController {

    private final LeaveService leaveService;

    @PostMapping
    public ResponseEntity<EmplLeaveDto> createLeave(@RequestBody EmplLeaveDto leaveDto) {
        return ResponseEntity.ok(leaveService.createLeave(leaveDto));
    }

    @GetMapping("/{leaveId}")
    public ResponseEntity<EmplLeaveDto> getLeave(@PathVariable String leaveId) {
        return leaveService.getLeave(leaveId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/employee/{partyId}")
    public ResponseEntity<List<EmplLeaveDto>> getLeavesByEmployee(@PathVariable String partyId) {
        return ResponseEntity.ok(leaveService.getLeavesByEmployee(partyId));
    }

    @DeleteMapping("/{leaveId}")
    public ResponseEntity<Void> deleteLeave(@PathVariable String leaveId) {
        leaveService.deleteLeave(leaveId);
        return ResponseEntity.noContent().build();
    }
}
