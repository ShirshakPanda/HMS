package com.cg.iter.viewcentre.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.iter.viewcenter.entities.DiagnosticCentre;
import com.cg.iter.viewcentre.repository.AdminDao;
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
    AdminDao dao;
	
	@Override
	public List<DiagnosticCentre> getCentres() {
		return dao.findAll();//JpaRepository method to fetch all DiagnosticCentre Details
	}

}
