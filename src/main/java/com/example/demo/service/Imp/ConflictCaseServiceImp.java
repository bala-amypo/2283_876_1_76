package com.example.demo.service.Imp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;
import com.example.demo.repository.ConflictCaseRepository;


@Service

public class ConflictCaseServiceImp implements ConflictCaseService
{
    @Autowired
     ConflictCaseRepository rep;
       @Override
    public ConflictCase createCase(ConflictCase conflictCase)
    {
        return rep.save(conflictCase);
    }
       @Override
    public ConflictCase updateCaseStatus(Long caseId,String status)
    {
       ConflictCase ss=rep.findById(caseId).orElseThrow(() -> new RuntimeException("Person not found"));;
       ss.setStatus(status);
       return rep.save(ss);
    }
    public List<ConflictCase> getCasesByPerson(Long personId) {

        List<ConflictCase> result = new ArrayList<>();

        // primary role
        result.addAll(rep.findByPrimaryPersonId(personId));

        // secondary role
        result.addAll(rep.findBySecondaryPersonId(personId));

        // remove duplicates (important!)
        return result.stream()
                     .distinct()
                     .toList();
    }
}
