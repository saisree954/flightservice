package com.ibm.flightservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.flightservice.dto.FlightRequestDTO;
import com.ibm.flightservice.dto.FlightSearchResponseDTO;
import com.ibm.flightservice.service.FlightSearchService;

@CrossOrigin(origins="*")
@RestController
public class FlightSearchController {
	
	@Autowired
	FlightSearchService flightService;
	 
	@PostMapping(value="/flight")
	public ResponseEntity<FlightSearchResponseDTO> flightSearch( @RequestBody FlightRequestDTO flightRequestDTO) {			
		
		 
        return ResponseEntity.ok().body(flightService.flightSearch(flightRequestDTO)); 
    }
	

	 @GetMapping("/test")
	 public String getMessage() {		 
		 
	        return "Welcome, You are in Flight search service";
	    }
}
	


