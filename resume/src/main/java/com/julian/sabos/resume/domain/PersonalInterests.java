package com.julian.sabos.resume.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
public class PersonalInterests {
	@Id
	private String id;
	private String interestName;
	private String description;

	public PersonalInterests() {
	}

	/**
	 * Constructor for PersonalInterests.
	 * 
	 * @param interestName
	 *            String
	 * @param description
	 *            String
	 */
	public PersonalInterests(String interestName, String description) {
		this.interestName = interestName;
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
	 * Method getInterestName.
	 * 
	 * @return String
	 */
	public String getInterestName() {
		return this.interestName;
	}

	/**
	 * Method setInterestName.
	 * 
	 * @param interestName
	 *            String
	 */
	public void setInterestName(String interestName) {
		this.interestName = interestName;
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