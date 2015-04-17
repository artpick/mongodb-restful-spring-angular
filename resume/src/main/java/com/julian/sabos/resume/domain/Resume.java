package com.julian.sabos.resume.domain;

import java.util.List;
import org.springframework.data.annotation.Id;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
public class Resume {
	@Id
	private String id;

	private String name;
	private String firstName;

	private String title;

	private String address;
	private String phoneNumber;

	private String personnalStatement;

	private List<Employment> employments;
	private List<Skill> skills;
	private List<Study> studies;
	private List<Language> languages;
	private List<PersonalInterests> personalInterests;

	public Resume() {
	}

	/**
	 * Constructor for Resume.
	 * 
	 * @param name
	 *            String
	 * @param firstName
	 *            String
	 * @param title
	 *            String
	 * @param address
	 *            String
	 * @param phoneNumber
	 *            String
	 * @param personnalStatement
	 *            String
	 * @param employments
	 *            List<Employment>
	 * @param skills
	 *            List<Skill>
	 * @param studies
	 *            List<Study>
	 * @param languages
	 *            List<Language>
	 * @param personalInterests
	 *            List<PersonalInterests>
	 */
	public Resume(String name, String firstName, String title, String address, String phoneNumber, String personnalStatement, List<Employment> employments,
			List<Skill> skills, List<Study> studies, List<Language> languages, List<PersonalInterests> personalInterests) {
		this.name = name;
		this.firstName = firstName;
		this.title = title;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.personnalStatement = personnalStatement;
		this.employments = employments;
		this.skills = skills;
		this.studies = studies;
		this.languages = languages;
		this.personalInterests = personalInterests;
	}

	/**
	 * Method getName.
	 * 
	 * @return String
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Method setName.
	 * 
	 * @param name
	 *            String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method getFirstName.
	 * 
	 * @return String
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Method setFirstName.
	 * 
	 * @param firstName
	 *            String
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	 * Method getAddress.
	 * 
	 * @return String
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Method setAddress.
	 * 
	 * @param address
	 *            String
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Method getPhoneNumber.
	 * 
	 * @return String
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * Method setPhoneNumber.
	 * 
	 * @param phoneNumber
	 *            String
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Method getPersonnalStatement.
	 * 
	 * @return String
	 */
	public String getPersonnalStatement() {
		return this.personnalStatement;
	}

	/**
	 * Method setPersonnalStatement.
	 * 
	 * @param personnalStatement
	 *            String
	 */
	public void setPersonnalStatement(String personnalStatement) {
		this.personnalStatement = personnalStatement;
	}

	/**
	 * Method getEmployments.
	 * 
	 * @return List<Employment>
	 */
	public List<Employment> getEmployments() {
		return this.employments;
	}

	/**
	 * Method setEmployments.
	 * 
	 * @param employments
	 *            List<Employment>
	 */
	public void setEmployments(List<Employment> employments) {
		this.employments = employments;
	}

	/**
	 * Method getSkills.
	 * 
	 * @return List<Skill>
	 */
	public List<Skill> getSkills() {
		return this.skills;
	}

	/**
	 * Method setSkills.
	 * 
	 * @param skills
	 *            List<Skill>
	 */
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	/**
	 * Method getStudies.
	 * 
	 * @return List<Study>
	 */
	public List<Study> getStudies() {
		return this.studies;
	}

	/**
	 * Method setStudies.
	 * 
	 * @param studies
	 *            List<Study>
	 */
	public void setStudies(List<Study> studies) {
		this.studies = studies;
	}

	/**
	 * Method getLanguages.
	 * 
	 * @return List<Language>
	 */
	public List<Language> getLanguages() {
		return this.languages;
	}

	/**
	 * Method setLanguages.
	 * 
	 * @param languages
	 *            List<Language>
	 */
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	/**
	 * Method getPersonalInterests.
	 * 
	 * @return List<PersonalInterests>
	 */
	public List<PersonalInterests> getPersonalInterests() {
		return this.personalInterests;
	}

	/**
	 * Method setPersonalInterests.
	 * 
	 * @param personalInterests
	 *            List<PersonalInterests>
	 */
	public void setPersonalInterests(List<PersonalInterests> personalInterests) {
		this.personalInterests = personalInterests;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Resume [name=" + name + ", firstName=" + firstName + ", title=" + title + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", personnalStatement=" + personnalStatement + ", employments=" + employments + ", skills=" + skills + ", studies=" + studies
				+ ", languages=" + languages + ", personalInterests=" + personalInterests + "]";
	}
}
