package com.cg.iter.createcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.iter.createcenter.entities.DiagnosticCentre;
@Repository
public interface AdminDao extends JpaRepository<DiagnosticCentre,String>{
/*
 * 
 */
	@Query("select d.centreName from DiagnosticCentre d where d.centreName=?1")
	String getCentre(String centreName);
	
}
