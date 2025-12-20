package com.example.demo.service.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.service.VendorEngagementService;
import com.example.demo.repository.VendorEngagementRepository;

@Service

public class VendorEngagementServiceImpl implements VendorEngagementService
{
        @Autowired
      VendorEngagementRepository rep;
       @Override
    public VendorEngagementRecord addEngagement(VendorEngagementRecord record)
    {
        return rep.save(record);
    }
       @Override
    public List<VendorEngagementRecord>getEngagementsByEmployee(Long employeeId)
    {
        return rep.findByEmployeeId(employeeId);
    }
       @Override
    public List<VendorEngagementRecord>getEngagementsByVendor(Long vendorId)
    {
        return rep.findByVendorId(vendorId);
    }
       @Override
    public List<VendorEngagementRecord>getAllEngagements()
    {
        return rep.findAll();
    }
}