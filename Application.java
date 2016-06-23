package com.training;

public class Application {
	
	public static void main(String[] args) {
		
		LifeInsurance policy = new LifeInsurance(10199,"MoneyBack",500000.00D,"QTR");
		
		PolicyHolder holder = new PolicyHolder("Ramesh","Reshmi");
		
		InsuranceAgent agent = new InsuranceAgent();
		
		double premiumAmount = agent.calculatePremium(policy);
		
		String message = holder.payPremium(premiumAmount);
		
		System.out.println(message);
	}
}