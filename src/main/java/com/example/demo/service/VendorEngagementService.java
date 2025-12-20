package com.example.demo.service;
import com.example.demo.model.VendorEngagementRecord;
import java.util.*;

public interface  VendorEngagementService
{
     VendorEngagementRecord addEngagement( VendorEngagementRecord record);
     List<VendorEngagementRecord>getEngagementsByEmployee( employeeId);
}