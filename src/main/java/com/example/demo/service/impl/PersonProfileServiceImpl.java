package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ApiException;
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
    public PersonProfile getPersonById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ApiException("person not found"));
    }

    @Override
    public List<PersonProfile> getAllPersons() {
        return repo.findAll();
    }

    @Override
    public PersonProfile updateRelationshipDeclared(Long id, boolean declared) {
        PersonProfile person = repo.findById(id)
                .orElseThrow(() -> new ApiException("person not found"));
        person.setRelationshipDeclared(declared);
        return repo.save(person);
    }

    @Override
    public PersonProfile findByReferenceId(String referenceId) {
        return repo.findByReferenceId(referenceId)
                .orElseThrow(() -> new ApiException("reference not found"));
    }
}
