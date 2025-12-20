package com.example.demo.service.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;

import com.example.demo.repository.RelationshipDeclarationRepository;
@Service


public class RelationshipDeclarationServiceImpl implements RelationshipDeclarationService{
    

    private final RelationshipDeclarationRepository rep;

    public RelationshipDeclarationServiceImpl(RelationshipDeclarationRepository rep)
    {
        this.rep = rep;
    }

    @Override
    public RelationshipDeclaration declareRelationship(RelationshipDeclaration ss)
    {
        return rep.save(ss);
    }
    @Override
    public List<RelationshipDeclaration> getDeclarationsByPerson(Long personId)
    {
        return rep.findByPersonId(personId); 
    }
    @Override
    public RelationshipDeclaration verifyDeclaration(Long id,Boolean Verified)
    {
         RelationshipDeclaration ss=rep.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
         ss.setIsVerified(Verified);
         return rep.save(ss);
    }
     @Override
    public List<RelationshipDeclaration> getAllDeclarations()
    {
        return rep.findAll(); 
    }
}