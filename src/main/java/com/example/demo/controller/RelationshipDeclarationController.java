package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;

@RestController
@RequestMapping("/api/relationships")
   public class  RelationshipDeclarationController
   {
      @Autowired
      RelationshipDeclarationService ser;
       @PostMapping
          public RelationshipDeclaration declareRealtionship(@RequestBody  RelationshipDeclaration ss)
          {
               return ser.declareRealtionship(ss);
          }
     
   }