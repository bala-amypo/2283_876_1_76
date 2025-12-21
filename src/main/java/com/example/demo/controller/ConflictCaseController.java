package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;
@RestController
@RequestMapping("/api/conflict-cases")
public class ConflictCaseController {

    private final ConflictCaseService ser;
    public ConflictCaseController(ConflictCaseService ser) {
        this.ser = ser;
    }

    // FIX 1: Removed Optional from return type and body
    @PostMapping
    public ResponseEntity<ConflictCase> createCase(@RequestBody ConflictCase conflictCase) {
        return ResponseEntity.ok(ser.createCase(conflictCase));
    }

    // FIX 2: Removed Optional from return type and body
    @PutMapping("/{id}/status")
    public ResponseEntity<ConflictCase> updateCaseStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return ResponseEntity.ok(ser.updateCaseStatus(id, status));
    }

    @GetMapping("/person/{personId}")
    public ResponseEntity<List<ConflictCase>> getCasesByPerson(@PathVariable Long personId) {
        return ResponseEntity.ok(ser.getCasesByPerson(personId));
    }

    // FIX 3: Removed Optional from return type and body
    @GetMapping("/{id}")
    public ResponseEntity<ConflictCase> getCaseById(@PathVariable Long id) {
        return ResponseEntity.ok(ser.getCaseById(id));
    }

    @GetMapping
    public ResponseEntity<List<ConflictCase>> getAllCases() {
        return ResponseEntity.ok(ser.getAllCases());
    }
}