package com.example.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;

@Service

public class PersonProfileServiceimp implements PersonProfileService{
    @Autowired
    repository rep;

    @Override
    public PersonProfile createPerson(PersonProfile ss)
    {
        return rep.save(ss);
    }
}
