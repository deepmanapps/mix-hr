package com.mix.hr.controller;

import com.mix.hr.dto.PartySkillDto;
import com.mix.hr.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @PostMapping
    public ResponseEntity<PartySkillDto> addSkill(@RequestBody PartySkillDto partySkillDto) {
        return ResponseEntity.ok(skillService.addSkillToParty(partySkillDto));
    }

    @GetMapping("/party/{partyId}")
    public ResponseEntity<List<PartySkillDto>> getSkillsByParty(@PathVariable String partyId) {
        return ResponseEntity.ok(skillService.getSkillsByParty(partyId));
    }

    @DeleteMapping("/party/{partyId}/type/{skillTypeId}")
    public ResponseEntity<Void> removeSkill(@PathVariable String partyId, @PathVariable String skillTypeId) {
        skillService.removeSkillFromParty(partyId, skillTypeId);
        return ResponseEntity.noContent().build();
    }
}
