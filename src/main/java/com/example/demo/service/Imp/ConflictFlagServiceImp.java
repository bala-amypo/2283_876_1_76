package com.example.demo.service.Imp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import com.example.demo.repository.ConflictFlagRepository;


@Service

public class ConflictFlagServiceImp implements ConflictFlagService
{
    @Autowired
     ConflictFlagRepository rep;
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
    public ConflictCase getCasesById(Long id)
    {
        return rep.findById(id).orElseThrow(() -> new RuntimeException("Conflict case not found"));
    }
}