package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController

public class PersonProfileController{
     @Autowired
    PersonProfileService ser;
   @PostMapping("/api/persons")
   public Sentity createData(@RequestBody Sentity ss)
   {
        return ser.createData(ss);
   }
}