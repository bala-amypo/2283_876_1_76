package com.example.demo.service;
import com.example.demo.model.PersonProfile;
import java.util.*;
public interface PersonProfileService 
{
 PersonProfile createPerson(PersonProfile ss);   
 Optional<PersonProfile>getPersonById(Long id);
 List<PersonProfile>getAllPersons();
 personProfile updateRelationshipDeclared(Long id, Boolean declared)
}