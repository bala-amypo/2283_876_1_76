package com.example.demo.service.Imp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;

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
}