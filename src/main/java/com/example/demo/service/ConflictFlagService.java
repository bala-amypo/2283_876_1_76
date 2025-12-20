package com.example.demo.service;
import java.util.*;

import com.example.demo.model.ConflictFlag;
public interface  ConflictFlagService
{
    ConflictFlag addFlag(ConflictFlag flag);
    List<ConflictCase>getFlagsByCase(Long caseId);
}