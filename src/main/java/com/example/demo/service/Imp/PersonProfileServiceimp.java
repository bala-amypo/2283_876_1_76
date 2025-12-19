package com.example.demo.service.imp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import com.example.demo.repository.PersonProfileRepository;

@Service

public class PersonProfileServiceimp implements PersonProfileService{
    @Autowired
     PersonProfileRepository rep;

    @Override
    public PersonProfile createPerson(PersonProfile ss)
    {
        return rep.save(ss);
    }
    @Override
    public Optional<PersonProfile> getPersonById(Long id)
    {
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
       Optional<PersonProfile> ss=getPersonById(id);
        ss.setRelationshipDeclared(declared);
        return rep.save(ss); 
    }
}
