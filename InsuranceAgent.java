package com.training;

public class InsuranceAgent {
	
	public InsuranceAgent() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String agentName;
	

public String getAgentName() {
		return agentName;
	}


	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}


public double calculatePremium(LifeInsurance policy)
{
	 double premium = (policy.getPolicyAmount())/10.00;
	 
	 return premium;
}
}