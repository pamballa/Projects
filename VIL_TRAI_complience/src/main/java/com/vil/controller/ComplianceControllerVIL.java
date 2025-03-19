package com.vil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vil.entities.ComplianceRecord;
import com.vil.service.ComplianceService;
import com.vil.utilities.UserComplienceDTO;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("/api")
public class ComplianceControllerVIL {

	@Autowired
	private ComplianceService service;
	
	//test API
	@GetMapping("/complience")
	public ResponseEntity<String> checkAPI() {
		return new ResponseEntity<String>("success", HttpStatusCode.valueOf(200));
		
	}
	
	@ResponseBody
	@PostMapping("/register/complience")
	public ResponseEntity<ComplianceRecord> addRecord(@RequestBody ComplianceRecord record) {
		System.out.println("addrecord mtheod");
		 ComplianceRecord res =service.saveRecord(record);
		 return new ResponseEntity<String>(HttpStatusCode.valueOf(200)).ok(res);
	}
	
}
