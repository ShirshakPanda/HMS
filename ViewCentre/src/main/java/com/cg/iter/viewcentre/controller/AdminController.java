package com.cg.iter.viewcentre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.viewcenter.entities.DiagnosticCentre;
import com.cg.iter.viewcentre.service.AdminService;


@RestController
@RequestMapping("/DiagnosticCentre")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	@Autowired
	AdminService service;

//Sends Center details
	@GetMapping("/find")
	public ResponseEntity<List<DiagnosticCentre>> getCentres() {
		List<DiagnosticCentre> list = service.getCentres();
		return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
	}
}