package com.cg.iter.deletecentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.iter.deletecentre.entities.DiagnosticCentre;
@Repository
public interface AdminDao extends JpaRepository<DiagnosticCentre,String> {

}
