package com.example.demo.service;
import com.example.demo.model.PersonProfile;
import java.util.*;
public interface PersonProfileService 
{
 PersonProfile createPerson(PersonProfile ss);   
 Optional<PersonProfile>getPersonBtId(Long id);
}