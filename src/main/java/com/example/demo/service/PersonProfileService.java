package com.example.demo.service;
import com.example.demo.model.PersonProfile;
import java.util.*;
public interface PersonProfileService 
{
 PersonProfile createPerson(PersonProfile ss);   
 PersonProfile getPersonById(Long id);
 List<PersonProfile>getAllPersons();
 PersonProfile updateRelationshipDeclared(Long id, Boolean declared);
 PersonProfile findByReferenceId(String referenceId);
 Optional<PersonProfile> getPersonById(Long id);

}