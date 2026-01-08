package com.mix.hr.controller;

import com.mix.hr.dto.PartyDto;
import com.mix.hr.dto.PersonDto;
import com.mix.hr.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parties")
@RequiredArgsConstructor
public class PartyController {

    private final PartyService partyService;

    @PostMapping
    public ResponseEntity<PartyDto> createParty(@RequestBody PartyDto partyDto) {
        return ResponseEntity.ok(partyService.createParty(partyDto));
    }

    @PostMapping("/persons")
    public ResponseEntity<PersonDto> createPerson(@RequestBody PersonDto personDto) {
        return ResponseEntity.ok(partyService.createPerson(personDto));
    }

    @GetMapping("/{partyId}")
    public ResponseEntity<PartyDto> getParty(@PathVariable String partyId) {
        return partyService.getParty(partyId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDto>> getAllPersons() {
        return ResponseEntity.ok(partyService.getAllPersons());
    }

    @DeleteMapping("/{partyId}")
    public ResponseEntity<Void> deleteParty(@PathVariable String partyId) {
        partyService.deleteParty(partyId);
        return ResponseEntity.noContent().build();
    }
}
