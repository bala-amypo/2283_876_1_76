package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
 @PostMapping
   public RelationshipDeclaration RelationshipDeclarationService(@RequestBody PersonProfile ss)
   {
        return ser.createPerson(ss);
   }