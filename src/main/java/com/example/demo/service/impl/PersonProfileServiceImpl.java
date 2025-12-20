package com.example.demo.service.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import com.example.demo.exception.ApiException;

import com.example.demo.repository.PersonProfileRepository;

@Service

public class PersonProfileServiceImpl implements PersonProfileService{
   private final PersonProfileRepository rep;

    public PersonProfileServiceImpl(PersonProfileRepository rep) {
        this.rep = rep;
    }

    @Override
    public PersonProfile createPerson(PersonProfile ss)
    {
        return rep.save(ss);
    }
   @Override
    public Optional<PersonProfile> getPersonById(Long id) {
        return rep.findById(id);
    }


    @Override
    public List<PersonProfile> getAllPersons()
    {
        return rep.findAll();
    }
    @Override
    public PersonProfile updateRelationshipDeclared(Long id,Boolean declared)
    {
       PersonProfile ss=rep.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
        ss.setRelationshipDeclared(declared);
        return rep.save(ss); 
    }
    @Override
    public PersonProfile findByReferenceId(String referenceId)
    {
       return rep.findByReferenceId(referenceId)
            .orElseThrow(() -> new RuntimeException("Person not found")); 
    }
}
