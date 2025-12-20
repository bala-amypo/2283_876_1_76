package com.example.demo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;


@RestController
@RequestMapping("/api/conflict-cases")

public class ConflictCaseController{
     @Autowired
    ConflictCaseService  ser;
     @PostMapping
          public ConflictCase createCase(@RequestBody  ConflictCase conflictCase)
          {
               return ser.createCase(conflictCase);
          }
     @PutMapping
          public ConflictCase updateCaseStatus(@PathVariable caseId,@RequestParam status)
          {
               return ser.updateCaseStatus(caseId,status);
          }
}
