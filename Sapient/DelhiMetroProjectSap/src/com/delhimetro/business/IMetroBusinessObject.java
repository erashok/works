package com.delhimetro.business;

public interface IMetroBusinessObject {

	
	public boolean checkViabilityforEntry(String cardNumber);
	public boolean chechViabilityForExit(String cardNumber);
	public double doubchargeCustomer(String cardNumber);
}
