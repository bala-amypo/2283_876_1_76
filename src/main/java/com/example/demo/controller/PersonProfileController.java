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
public PersonProfile create(@RequestBody PersonProfile p) {
    return service.createPerson(p);
}


@GetMapping("/{id}")
public Optional<PersonProfile> getById(@PathVariable Long id) {
    return Optional.of(service.getPersonById(id));
}

  @GetMapping
public List<PersonProfile> getAll() {
    return service.getAllPersons();
}

@GetMapping("/lookup/{refId}")
public Optional<PersonProfile> lookup(@PathVariable String refId) {
    return Optional.of(service.findByReferenceId(refId));
}

   @PutMapping("/{id}/relationship")
    public PersonProfile toggleRelationshipDeclared(
        @PathVariable Long id,
        @RequestParam boolean declared) {

    return service.updateRelationshipDeclared(id, declared);
}

}
