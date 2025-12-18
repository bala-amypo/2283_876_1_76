package com.example.demo.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/persons")
public class PersonProfileController{
     @Autowired
    PersonProfileService ser;
   @PostMapping("/")
   public PersonProfile createData(@RequestBody PersonProfile ss)
   {
        return ser.createPerson(ss);
   }
   @GetMapping("/{id}")
   public Optional<PersonProfile> getPersonById(@PathVariable Long id)
   {
     return ser.getPersonById(id);
   }
}