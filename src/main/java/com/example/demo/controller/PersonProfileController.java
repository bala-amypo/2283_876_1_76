package com.example.demo.controller;

import java.util.Optional;
import java.util.List;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/persons")
public class PersonProfileController{
     @Autowired
    PersonProfileService ser;
   @PostMapping
   public PersonProfile createPerson(@RequestBody PersonProfile ss)
   {
        return ser.createPerson(ss);
   }
   @GetMapping("/{id}")
   public Optional<PersonProfile> getPersonById(@PathVariable Long id)
   {
     return ser.getPersonById(id);
   }
   @GetMapping
   public List<PersonProfile>getAllPersons()
   {
     return ser.getAllPersons();
   }
   @PutMapping("/{id}/relationship-declared")
   public PersonProfile updateRelationshipDeclared(@PathVariable Long id,@RequestParam Boolean declared)
   {
    return ser.updateRelationshipDeclared(id,declared);
   }
   @GetMapping("/lookup/{refernceId}")
   public PersonProfile findByReferenceId(@PathVariable String referencedId)
   {
    return ser.findByReferenceId(id,declared);
   }

}