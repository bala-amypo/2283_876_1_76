package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/api/persons")
public class PersonProfileController{
     @Autowired
    PersonProfileService ser;
   @PostMapping("/")
   public PersonProfileService createData(@RequestBody PersonProfile ss)
   {
        return ser.createPerson(ss);
   }
}