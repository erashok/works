package com.delhimetro.dao.entity;

import java.math.BigDecimal;

public class FairDtls extends BaseDAO {
	
	String daysType;
	BigDecimal amount;
	/**
	 * @return the daysType
	 */
	public String getDaysType() {
		return daysType;
	}
	/**
	 * @param daysType the daysType to set
	 */
	public void setDaysType(String daysType) {
		this.daysType = daysType;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
