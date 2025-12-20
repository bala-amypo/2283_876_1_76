package com.example.demo.repository;

import java.util.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.VendorEngagementRecord;
@Repository
public interface VendorEngagementRepository extends JpaRepository <VendorEngagementRecord,Long>{
   List<VendorEngagementRecord>findBy(Long employeeId);
}