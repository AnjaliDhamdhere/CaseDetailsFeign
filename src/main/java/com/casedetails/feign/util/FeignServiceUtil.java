package com.casedetails.feign.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value= "FeignCaseDetails",  url= "http://localhost:8081/caseDetails")
public interface FeignServiceUtil {


	@GetMapping(path= "feignCaseDetails",produces= "application/json")
	Casedetails getCasedetails() ;
			
}
