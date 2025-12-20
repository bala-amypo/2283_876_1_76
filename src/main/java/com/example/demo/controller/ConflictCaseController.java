package com.example.demo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

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
     @PutMapping("/{id}/status")
          public ConflictCase updateCaseStatus(@PathVariable("id") Long caseId,@RequestParam String status)
          {
               return ser.updateCaseStatus(caseId,status);
          }
      @GetMapping("/person/{personId}")
        public List<ConflictCase>getCasesByPerson(@PathVariable Long personId){
              return ser.getCasesByPerson(personId);
        }
@GetMapping("/{id}")
public ResponseEntity<ConflictCase> getCaseById(@PathVariable Long id) {
    return ResponseEntity.ok(ser.getCaseById(id));
}


        @GetMapping
        public List<ConflictCase>getAllCases(){
              return ser.getAllCases();
        }

}
