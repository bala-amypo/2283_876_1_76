package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    private final PersonProfileRepository repo;

    public PersonProfileServiceImpl(PersonProfileRepository repo) {
        this.repo = repo;
    }

    @Override
    public PersonProfile createPerson(PersonProfile person) {
        return repo.save(person);
    }

    @Override
    public Optional<PersonProfile> getPersonById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<PersonProfile> getAllPersons() {
        return repo.findAll();
    }

    @Override
    public PersonProfile updateRelationshipDeclared(Long id, Boolean declared) {
        PersonProfile p = repo.findById(id).orElseThrow();
        p.setRelationshipDeclared(declared);
        return repo.save(p);
    }

    @Override
    public PersonProfile findByReferenceId(String referenceId) {
        return repo.findByReferenceId(referenceId).orElseThrow();
    }
}
