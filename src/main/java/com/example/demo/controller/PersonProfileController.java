package com.example.demo.controller;

import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
@RestController
@RequestMapping("/api/persons")
public class PersonProfileController {

    private final PersonProfileService service;

    public PersonProfileController(PersonProfileService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<PersonProfile> create(@RequestBody PersonProfile p) {
        return ResponseEntity.ok(service.createPerson(p));
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Optional<PersonProfile>> getById(@PathVariable Long id) {
    //     return ResponseEntity.ok(
    //             Optional.of(service.getPersonById(id))
    //     );
    // }

    @GetMapping
    public ResponseEntity<List<PersonProfile>> getAll() {
        return ResponseEntity.ok(service.getAllPersons());
    }

    // @GetMapping("/lookup/{refId}")
    // public ResponseEntity<Optional<PersonProfile>> lookup(@PathVariable String refId) {
    //     return ResponseEntity.ok(
    //             Optional.of(service.findByReferenceId(refId))
    //     );
    // }
// Change 1: Get by ID
@GetMapping("/{id}")
public ResponseEntity<PersonProfile> getById(@PathVariable Long id) {
    // service.getPersonById(id) returns PersonProfile, not Optional
    return ResponseEntity.ok(service.getPersonById(id));
}

// Change 2: Lookup by Reference ID
@GetMapping("/lookup/{refId}")
public ResponseEntity<PersonProfile> lookup(@PathVariable String refId) {
    // service.findByReferenceId(refId) returns PersonProfile, not Optional
    return ResponseEntity.ok(service.findByReferenceId(refId));
}
    @PutMapping("/{id}/relationship")
    public ResponseEntity<PersonProfile> toggleRelationshipDeclared(
            @PathVariable Long id,
            @RequestParam boolean declared) {

        return ResponseEntity.ok(
                service.updateRelationshipDeclared(id, declared)
        );
    }
}
