package com.example.demo.service.Imp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;

import com.example.demo.repository.RelationshipDeclarationRepository;
@Service


public class RelationshipDeclarationServiceimp implements RelationshipDeclarationService{
    @Autowired
      RelationshipDeclarationRepository rep;

    @Override
    public RelationshipDeclaration declareRealtionship(RelationshipDeclaration ss)
    {
        return rep.save(ss);
    }
}