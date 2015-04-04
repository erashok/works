package com.delhimetro.dao.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ashok Yadav
 */
public class MetroSmartCard extends BaseDAO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4974627448052669188L;
	private Integer smartCordId;
	private String smartCardNumber;
	private BigDecimal balanceAmount;
	private Set<DailytravelDetails> dailytravelDetails = new HashSet<DailytravelDetails>(
			0);

	public MetroSmartCard() {
	}

	/**
	 * @return the smartCordId
	 */
	public Integer getSmartCordId() {
		return smartCordId;
	}

	/**
	 * @param smartCordId the smartCordId to set
	 */
	public void setSmartCordId(Integer smartCordId) {
		this.smartCordId = smartCordId;
	}

	/**
	 * @return the smartCardNumber
	 */
	public String getSmartCardNumber() {
		return smartCardNumber;
	}

	/**
	 * @param smartCardNumber the smartCardNumber to set
	 */
	public void setSmartCardNumber(String smartCardNumber) {
		this.smartCardNumber = smartCardNumber;
	}

	
	/**
	 * @return the dailytravelDetails
	 */
	public Set<DailytravelDetails> getDailytravelDetails() {
		return dailytravelDetails;
	}

	/**
	 * @return the balanceAmount
	 */
	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}

	/**
	 * @param balanceAmount the balanceAmount to set
	 */
	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param dailytravelDetails the dailytravelDetails to set
	 */
	public void setDailytravelDetails(Set<DailytravelDetails> dailytravelDetails) {
		this.dailytravelDetails = dailytravelDetails;
	}

	
}
