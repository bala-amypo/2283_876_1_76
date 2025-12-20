package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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
    
    @GetMapping("/{id}")

    public ResponseEntity<Optional<PersonProfile>> getById(@PathVariable Long id) {
    return ResponseEntity.ok(
            Optional.of(service.getPersonById(id))
    );
}


    @GetMapping
    public ResponseEntity<List<PersonProfile>> getAll() {
        return ResponseEntity.ok(service.getAllPersons());
    }

    @GetMapping("/lookup/{refId}")
    public ResponseEntity<PersonProfile> lookup(@PathVariable String refId) {
        return ResponseEntity.ok(service.findByReferenceId(refId));
    }

    @PutMapping("/{id}/relationship")
    public PersonProfile toggleRelationshipDeclared(
            @PathVariable Long id,
            @RequestParam Boolean declared) {

        return service.updateRelationshipDeclared(id, declared);
    }
}
