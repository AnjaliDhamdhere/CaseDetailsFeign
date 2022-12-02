package com.casedetails.feign.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Casedetails {
	private Long caseNo = 123456L;
	private String caseType = "XInsurance";
	private String caseName ="Ron";
	private Long clientId = 32424354L;
	private String agentName = "Parker";
	private Long nbamt =1400L;
	
	/*
	 * public Casedetails(long caseNo, String caseType, String caseName, long
	 * clientId, String agentName, double nbamt) { super(); this.caseNo = caseNo;
	 * this.caseType = caseType; this.caseName = caseName; this.clientId = clientId;
	 * this.agentName = agentName; this.nbamt = nbamt; }
	 * 
	 * 
	 * public long getCaseNo() { return caseNo; }
	 * 
	 * 
	 * public void setCaseNo(long caseNo) { this.caseNo = caseNo; }
	 * 
	 * 
	 * public String getCaseType() { return caseType; }
	 * 
	 * 
	 * public void setCaseType(String caseType) { this.caseType = caseType; }
	 * 
	 * 
	 * public String getCaseName() { return caseName; }
	 * 
	 * 
	 * public void setCaseName(String caseName) { this.caseName = caseName; }
	 * 
	 * 
	 * public long getClientId() { return clientId; }
	 * 
	 * 
	 * public void setClientId(long clientId) { this.clientId = clientId; }
	 * 
	 * 
	 * public String getAgentName() { return agentName; }
	 * 
	 * 
	 * public void setAgentName(String agentName) { this.agentName = agentName; }
	 * 
	 * 
	 * public double getNbamt() { return nbamt; }
	 * 
	 * 
	 * public void setNbamt(double nbamt) { this.nbamt = nbamt; }
	 * 
	 */
	
}

