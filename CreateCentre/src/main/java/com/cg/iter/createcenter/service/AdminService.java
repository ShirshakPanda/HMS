package com.cg.iter.createcenter.service;

import com.cg.iter.createcenter.entities.DiagnosticCentre;

public interface AdminService {

	DiagnosticCentre addCentre(DiagnosticCentre diagnosticCentre);
	String getCentre(String centreName);
	
}
