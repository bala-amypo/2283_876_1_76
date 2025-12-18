package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JOY_BOY.entity.Sentity;
@Repository
public interface PersonProfileRepository extends JpaRepository <Sentity,Long>{
    
}
