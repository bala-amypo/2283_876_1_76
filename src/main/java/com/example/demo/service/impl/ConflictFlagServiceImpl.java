package com.example.demo.service.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import com.example.demo.repository.ConflictFlagRepository;


@Service

public class ConflictFlagServiceImpl implements ConflictFlagService
{

    
    private final ConflictFlagRepository rep;
    private final ConflictCaseRepository caseRepo;

    public ConflictFlagServiceImpl(ConflictFlagRepository rep,ConflictCaseRepository caseRepo) {
        this.rep = rep;
        this.caseRepo = caseRepo;
    }


    @Override
    public ConflictFlag addFlag(ConflictFlag flag)
    {
        return rep.save(flag);
    }
    @Override
    public List<ConflictFlag> getFlagsByCase(Long caseId)
    {
        return rep.findByCaseId(caseId);
    }
    @Override
    public ConflictFlag getFlagById(Long id)
    {
        return rep.findById(id).orElseThrow(() -> new RuntimeException("Conflict case not found"));
    }
    @Override
    public List<ConflictFlag> getAllFlags()
    {
        return rep.findAll();
    }
}