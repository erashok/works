package com.delhimetro.dao.dataaccess;

import com.delhimetro.dao.entity.BaseDAO;

public interface IMetroDAOAccess {
	
	public BaseDAO getTraveldetails(String smartCardNumner);
	
	public double calculatefair(String sourceStation,String destinationStation);
	
	public boolean bchechViabilityForStation(String cardNumber);

}
