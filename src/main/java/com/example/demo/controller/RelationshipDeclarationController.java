package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/relationships")
 @PostMapping
   public class  RelationshipDeclaration
   {
      @Autowired
      RelationshipDeclarationService ser;
       @PostMapping
          public RelationshipDeclaration RelationshipDeclarationService(@RequestBody  RelationshipDeclaration ss)
          {
               return ser.RelationshipDeclarationService(ss);
          }
     
   }