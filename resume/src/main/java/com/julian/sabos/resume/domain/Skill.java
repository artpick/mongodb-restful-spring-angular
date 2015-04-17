package com.julian.sabos.resume.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
public class Skill {
	@Id
	private String id;
	private String skillName;
	private Byte competence;
	private String skillDescription;

	public Skill() {
	}

	/**
	 * Constructor for Skill.
	 * 
	 * @param skillName
	 *            String
	 * @param competence
	 *            Byte
	 * @param skillDescription
	 *            String
	 */
	public Skill(String skillName, Byte competence, String skillDescription) {
		this.skillName = skillName;
		this.competence = competence;
		this.skillDescription = skillDescription;
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
	 * Method getSkillName.
	 * 
	 * @return String
	 */
	public String getSkillName() {
		return this.skillName;
	}

	/**
	 * Method setSkillName.
	 * 
	 * @param skillName
	 *            String
	 */
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	/**
	 * Method getCompetence.
	 * 
	 * @return Byte
	 */
	public Byte getCompetence() {
		return this.competence;
	}

	/**
	 * Method setCompetence.
	 * 
	 * @param competence
	 *            Byte
	 */
	public void setCompetence(Byte competence) {
		this.competence = competence;
	}

	/**
	 * Method getSkillDescription.
	 * 
	 * @return String
	 */
	public String getSkillDescription() {
		return this.skillDescription;
	}

	/**
	 * Method setSkillDescription.
	 * 
	 * @param skillDescription
	 *            String
	 */
	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}
}