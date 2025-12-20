package com.example.demo.service;

import java.util.*;
import com.example.demo.model.PersonProfile;

public interface PersonProfileService {

    PersonProfile createPerson(PersonProfile person);

    Optional<PersonProfile> getPersonById(Long id);

    List<PersonProfile> getAllPersons();

    PersonProfile updateRelationshipDeclared(Long id, Boolean declared);

    PersonProfile findByReferenceId(String referenceId);
}
