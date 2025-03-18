package com.vil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vil.entities.ComplianceRecord;


@Repository
public interface ComplianceRepository  extends JpaRepository<ComplianceRecord, Integer>{

}
