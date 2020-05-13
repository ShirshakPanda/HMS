package com.cg.iter.createcenter.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.createcenter.entities.DiagnosticCentre;
import com.cg.iter.createcenter.repository.AdminDao;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
   @Autowired
	AdminDao dao;
	
	@Override
	public DiagnosticCentre addCentre(DiagnosticCentre diagnosticCentre) {
		
		return dao.save(diagnosticCentre);
	}

	@Override
	public String getCentre(String centreName) {
		// TODO Auto-generated method stub
		return dao.getCentre(centreName);

	}

}
