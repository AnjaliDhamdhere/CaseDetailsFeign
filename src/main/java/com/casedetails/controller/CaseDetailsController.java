package com.casedetails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casedetails.model.CaseDetails;

@RestController
@RequestMapping ("/caseDetails")
public class CaseDetailsController {

	@GetMapping(produces= "application/json") 
	public CaseDetails getCaseDetails() {
		//return new CaseDetails(123456L, "XInsurance", "Ron", 32424354L, "Parker", 1400L);
		return new CaseDetails();
	}
	
	
}
