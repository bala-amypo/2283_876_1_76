package com.example.demo.service;
import com.example.demo.model.RelationshipDeclaration;
import java.util.*;
public interface  
{
 PersonProfile createPerson(PersonProfile ss);   
 Optional<PersonProfile>getPersonById(Long id);
 List<PersonProfile>getAllPersons();
 PersonProfile updateRelationshipDeclared(Long id, Boolean declared);
 PersonProfile findByReferenceId(String referenceId);
}