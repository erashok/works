package com.delhimetro.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DailytravelDetails extends BaseDAO implements java.io.Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5620326035018361876L;
	/**
	 * 
	 */

	private Integer recordId;
	private MetroSmartCard metroSmartCard;
	private String fromStation;
	private String toStation;
	private BigDecimal totalFair;

	private Date date;
	
	public DailytravelDetails(MetroSmartCard metroSmartCard, Date date) {
		this.metroSmartCard = metroSmartCard;
		this.date = date;
	}

	/**
	 * @return the totalFair
	 */
	public BigDecimal getTotalFair() {
		return totalFair;
	}

	/**
	 * @param totalFair the totalFair to set
	 */
	public void setTotalFair(BigDecimal totalFair) {
		this.totalFair = totalFair;
	}

	/**
	 * @return the recordId
	 */
	public Integer getRecordId() {
		return recordId;
	}

	/**
	 * @param recordId
	 *            the recordId to set
	 */
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	/**
	 * @return the metroSmartCard
	 */
	public MetroSmartCard getMetroSmartCard() {
		return metroSmartCard;
	}

	/**
	 * @param metroSmartCard
	 *            the metroSmartCard to set
	 */
	public void setMetroSmartCard(MetroSmartCard metroSmartCard) {
		this.metroSmartCard = metroSmartCard;
	}

	/**
	 * @return the fromStation
	 */
	public String getFromStation() {
		return fromStation;
	}

	/**
	 * @param fromStation
	 *            the fromStation to set
	 */
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	/**
	 * @return the toStation
	 */
	public String getToStation() {
		return toStation;
	}

	/**
	 * @param toStation
	 *            the toStation to set
	 */
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public DailytravelDetails() {
	}

	

}
