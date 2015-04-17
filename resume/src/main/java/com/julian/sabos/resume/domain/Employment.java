package com.julian.sabos.resume.domain;

import java.time.YearMonth;

import org.springframework.data.annotation.Id;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
public class Employment {
	@Id
	private String id;
	private String companyName;
	private String position;
	private YearMonth startingDate;
	private YearMonth stopingDate;
	private String description;

	public Employment() {
	}

	/**
	 * Constructor for Employment.
	 * 
	 * @param companyName
	 *            String
	 * @param position
	 *            String
	 * @param startingDate
	 *            YearMonth
	 * @param stopingDate
	 *            YearMonth
	 * @param description
	 *            String
	 */
	public Employment(String companyName, String position, YearMonth startingDate, YearMonth stopingDate, String description) {
		this.companyName = companyName;
		this.position = position;
		this.startingDate = startingDate;
		this.stopingDate = stopingDate;
		this.description = description;
	}

	/**
	 * Method getId.
	 * 
	 * @return String
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Method setId.
	 * 
	 * @param id
	 *            String
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Method getCompanyName.
	 * 
	 * @return String
	 */
	public String getCompanyName() {
		return this.companyName;
	}

	/**
	 * Method setCompanyName.
	 * 
	 * @param companyName
	 *            String
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * Method getPosition.
	 * 
	 * @return String
	 */
	public String getPosition() {
		return this.position;
	}

	/**
	 * Method setPosition.
	 * 
	 * @param position
	 *            String
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * Method getStartingDate.
	 * 
	 * @return YearMonth
	 */
	public YearMonth getStartingDate() {
		return this.startingDate;
	}

	/**
	 * Method setStartingDate.
	 * 
	 * @param startingDate
	 *            YearMonth
	 */
	public void setStartingDate(YearMonth startingDate) {
		this.startingDate = startingDate;
	}

	/**
	 * Method getStopingDate.
	 * 
	 * @return YearMonth
	 */
	public YearMonth getStopingDate() {
		return this.stopingDate;
	}

	/**
	 * Method setStopingDate.
	 * 
	 * @param stopingDate
	 *            YearMonth
	 */
	public void setStopingDate(YearMonth stopingDate) {
		this.stopingDate = stopingDate;
	}

	/**
	 * Method getDescription.
	 * 
	 * @return String
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Method setDescription.
	 * 
	 * @param description
	 *            String
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}