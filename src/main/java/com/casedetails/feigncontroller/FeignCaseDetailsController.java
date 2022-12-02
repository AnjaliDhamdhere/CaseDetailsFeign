package com.casedetails.feigncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casedetails.feign.util.Casedetails;
import com.casedetails.feign.util.FeignServiceUtil;

@RestController
@RequestMapping("/feignCaseDetailsDemo")
public class FeignCaseDetailsController {

	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	@GetMapping(produces= "applications/json")
	public Casedetails getCasedetails() {
		return feignServiceUtil.getCasedetails();
	}

	
	
}
