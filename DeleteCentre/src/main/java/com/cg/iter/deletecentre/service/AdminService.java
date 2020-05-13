package com.cg.iter.deletecentre.service;

import java.util.List;

import com.cg.iter.deletecentre.entities.DiagnosticCentre;



public interface AdminService {


	void deleteCentreById(String centreId);

	List<DiagnosticCentre> getCentres();

	Boolean getDetails(String centreId);
	
}
