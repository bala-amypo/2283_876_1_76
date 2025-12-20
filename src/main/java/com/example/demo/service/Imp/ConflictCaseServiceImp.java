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
    public ConflictCase addEngagement(VendorEngagementRecord record)
    {
        return rep.save(record);
    }
}
