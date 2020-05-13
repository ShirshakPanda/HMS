package com.cg.iter.createcentre.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.createcenter.entities.DiagnosticCentre;
import com.cg.iter.createcenter.service.AdminService;
import com.cg.iter.createcentre.exception.RecordFoundException;


@RestController
@RequestMapping("/DiagnosticCentre")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	AdminService service;
	private Random rand = new Random();
	// Fetches Center Details and maps
	@PostMapping("/create")
	public ResponseEntity<Boolean> create(@RequestBody DiagnosticCentre diagnosticCentre) {
		String centre = service.getCentre(diagnosticCentre.getCentreName());
		if (centre != null) {
			throw new RecordFoundException("CentreName found");
		} else {
			diagnosticCentre.setCentreId(Integer.toString(rand.nextInt(1000)));
			service.addCentre(diagnosticCentre);
			
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
	}

	@ExceptionHandler(RecordFoundException.class)
	public ResponseEntity<Boolean> userNotFound(RecordFoundException e) {
		return new ResponseEntity<>(false, HttpStatus.OK);
	}

}
