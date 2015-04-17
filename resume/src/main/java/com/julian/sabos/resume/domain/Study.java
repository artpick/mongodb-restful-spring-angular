package com.julian.sabos.resume.domain;

import java.time.Year;
import org.springframework.data.annotation.Id;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
public class Study {
	@Id
	private String id;
	private String title;
	private Year startingDate;
	private Year stopingDate;
	private String universityName;
	private String location;
	private String achievements;

	public Study() {
	}

	/**
	 * Constructor for Study.
	 * 
	 * @param title
	 *            String
	 * @param startingDate
	 *            Year
	 * @param stopingDate
	 *            Year
	 * @param universityName
	 *            String
	 * @param location
	 *            String
	 * @param achievements
	 *            String
	 */
	public Study(String title, Year startingDate, Year stopingDate, String universityName, String location, String achievements) {
		this.title = title;
		this.startingDate = startingDate;
		this.stopingDate = stopingDate;
		this.universityName = universityName;
		this.location = location;
		this.achievements = achievements;
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
	 * Method getTitle.
	 * 
	 * @return String
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Method setTitle.
	 * 
	 * @param title
	 *            String
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Method getStartingDate.
	 * 
	 * @return Year
	 */
	public Year getStartingDate() {
		return this.startingDate;
	}

	/**
	 * Method setStartingDate.
	 * 
	 * @param startingDate
	 *            Year
	 */
	public void setStartingDate(Year startingDate) {
		this.startingDate = startingDate;
	}

	/**
	 * Method getStopingDate.
	 * 
	 * @return Year
	 */
	public Year getStopingDate() {
		return this.stopingDate;
	}

	/**
	 * Method setStopingDate.
	 * 
	 * @param stopingDate
	 *            Year
	 */
	public void setStopingDate(Year stopingDate) {
		this.stopingDate = stopingDate;
	}

	/**
	 * Method getUniversityName.
	 * 
	 * @return String
	 */
	public String getUniversityName() {
		return this.universityName;
	}

	/**
	 * Method setUniversityName.
	 * 
	 * @param universityName
	 *            String
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * Method getLocation.
	 * 
	 * @return String
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * Method setLocation.
	 * 
	 * @param location
	 *            String
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Method getAchievements.
	 * 
	 * @return String
	 */
	public String getAchievements() {
		return this.achievements;
	}

	/**
	 * Method setAchievements.
	 * 
	 * @param achievements
	 *            String
	 */
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
}