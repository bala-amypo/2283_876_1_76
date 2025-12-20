package com.example.demo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.service.VendorEngagementService;


@RestController
@RequestMapping("/api/engagements")

public class VendorEngagementCon