package com.example.demo.controller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;


@RestController
@RequestMapping("/api/conflict-flags")

public class ConflictFlagController{
     @Autowired
    ConflictFlagService  ser;
     @PostMapping
     public ConflictFlag addFlag(@RequestBody  ConflictFlag flag)
          {
               return ser.addFlag(flag);
          }
     @GetMapping("/case/{caseId}")
        public List<ConflictFlag>getFlagsByCase(@PathVariable Long caseId){
              return ser.getFlagsByCase(caseId);
        }
}