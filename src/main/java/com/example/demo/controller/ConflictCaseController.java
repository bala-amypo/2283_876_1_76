package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;

@RestController
@RequestMapping("/api/conflict-cases")
public class ConflictCaseController {

    private final ConflictCaseService ser;

    @Autowired
    public ConflictCaseController(ConflictCaseService ser) {
        this.ser = ser;
    }

  @PostMapping
public ResponseEntity<Optional<ConflictCase>> createCase(
        @RequestBody ConflictCase conflictCase) {

    return ResponseEntity.ok(
            Optional.of(ser.createCase(conflictCase))
    );
}


    @PutMapping("/{id}/status")
    public ResponseEntity<ConflictCase> updateCaseStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return ResponseEntity.ok(ser.updateCaseStatus(id, status));
    }

    @GetMapping("/person/{personId}")
    public ResponseEntity<List<ConflictCase>> getCasesByPerson(
            @PathVariable Long personId) {
        return ResponseEntity.ok(ser.getCasesByPerson(personId));
    }

   @GetMapping("/{id}")
public ResponseEntity<Optional<ConflictCase>> getCaseById(@PathVariable Long id) {
    return ResponseEntity.ok(
            Optional.of(ser.getCaseById(id))
    );
}

    @GetMapping
    public ResponseEntity<List<ConflictCase>> getAllCases() {
        return ResponseEntity.ok(ser.getAllCases());
    }
}
