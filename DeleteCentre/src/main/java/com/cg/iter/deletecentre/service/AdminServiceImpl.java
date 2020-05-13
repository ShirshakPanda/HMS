package com.cg.iter.deletecentre.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.deletecentre.entities.DiagnosticCentre;
import com.cg.iter.deletecentre.repository.AdminDao;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
    AdminDao dao;
	
	@Override
	public void deleteCentreById(String centreId) {
		dao.deleteById(centreId);;//JpaRepository method for deleting using centreId
		
	}

	@Override
	public List<DiagnosticCentre> getCentres() {
		return dao.findAll();
	}

	@Override
	public Boolean getDetails(String centreId) {
		return dao.existsById(centreId);
	}

	

}
