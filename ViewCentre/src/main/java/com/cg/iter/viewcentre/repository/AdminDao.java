package com.cg.iter.viewcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.iter.viewcenter.entities.DiagnosticCentre;



public interface AdminDao extends JpaRepository<DiagnosticCentre,String>{

}
