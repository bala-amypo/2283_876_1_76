package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
@RestController
@RequestMapping("/api/relationships")
 @PostMapping
   public class  RelationshipDeclaration
   {
      @Autowired
      RelationshipDeclarationService ser;
       @PostMapping
          public RelationshipDeclaration declareRealtionship(@RequestBody  RelationshipDeclaration ss)
          {
               return ser.declareRealtionship(ss);
          }
     
   }