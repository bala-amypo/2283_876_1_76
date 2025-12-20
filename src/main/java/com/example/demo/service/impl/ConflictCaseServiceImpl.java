package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.ConflictCase;
import com.example.demo.repository.ConflictCaseRepository;
import com.example.demo.service.ConflictCaseService;
import com.example.demo.exception.ApiException;

@Service
public class ConflictCaseServiceImpl implements ConflictCaseService {

    private final ConflictCaseRepository rep;

    public ConflictCaseServiceImpl(ConflictCaseRepository rep) {
        this.rep = rep;
    }

    @Override
    public ConflictCase createCase(ConflictCase conflictCase) {
        return rep.save(conflictCase);
    }

    @Override
    public ConflictCase updateCaseStatus(Long caseId, String status) {
        ConflictCase ss = rep.findById(caseId)
                .orElseThrow(() -> new ApiException("case not found"));
        ss.setStatus(status);
        return rep.save(ss);
    }

    @Override
    public List<ConflictCase> getCasesByPerson(Long personId) {
        return rep.findByPrimaryPersonIdOrSecondaryPersonId(personId, personId);
    }

    @Override
    public ConflictCase getCaseById(Long id) {
        return rep.findById(id)
                .orElseThrow(() -> new ApiException("case not found"));
    }

    @Override
    public List<ConflictCase> getAllCases() {
        return rep.findAll();
    }
}
