package com.example.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.PersonProfile;
import com.example.JOY_BOY.service.PersonProfileService;

@Service

public class PersonProfileServiceimp implements PersonProfileService{
    @Autowired
    repository rep;
    
    @Override
    public Sentity createData(Sentity ss)
    {
        return rep.save(ss);
    }
}
