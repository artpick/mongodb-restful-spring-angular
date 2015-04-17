package com.julian.sabos.resume.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
public class Language {
	@Id
	private String id;
	private String language;
	private Byte rate;

	public Language() {
	}

	/**
	 * Constructor for Language.
	 * 
	 * @param language
	 *            String
	 * @param rate
	 *            Byte
	 */
	public Language(String language, Byte rate) {
		this.language = language;
		this.rate = rate;
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
	 * Method getLanguage.
	 * 
	 * @return String
	 */
	public String getLanguage() {
		return this.language;
	}

	/**
	 * Method setLanguage.
	 * 
	 * @param language
	 *            String
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Method getRate.
	 * 
	 * @return Byte
	 */
	public Byte getRate() {
		return this.rate;
	}

	/**
	 * Method setRate.
	 * 
	 * @param rate
	 *            Byte
	 */
	public void setRate(Byte rate) {
		this.rate = rate;
	}
}