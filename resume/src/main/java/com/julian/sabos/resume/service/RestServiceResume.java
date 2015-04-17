package com.julian.sabos.resume.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.julian.sabos.resume.domain.Resume;
import com.julian.sabos.resume.repository.ResumeRepository;

/**
 * Rest service which expose the resume method.
 * 
 * @author Julian
 * @version $Revision: 1.0 $
 */
@RestController
public class RestServiceResume {

	// Statics.
	private static final String ST_FIRST_NAME = "firstName";
	private static final String ST_NAME = "name";

	// Autowired services.
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private ResumeRepository resumeRepo;

	// LOGGER
	private static Logger LOGGER = Logger.getLogger(RestServiceResume.class);

	/**
	 * resume method, find the corresponding record from its name and first name. TODO: Need to add an extra parameter to manage the internationalization of the
	 * application (locale or lang)
	 * 
	 * @param firstName
	 *            String
	 * @param name
	 *            String
	 * @return Resume
	 */
	@RequestMapping(value = { "/{firstName}/{name}" }, method = { RequestMethod.GET }, produces = { "application/json" })
	public Resume resume(@PathVariable(ST_FIRST_NAME) String firstName, @PathVariable(ST_NAME) String name) {

		// TODO: There's no case insensitive method included on mongodb => Need a workaround here
		// https://jira.mongodb.org/browse/SERVER-90
		Query qr = new Query();
		qr.addCriteria(Criteria.where(ST_NAME).is(name).and(ST_FIRST_NAME).is(firstName));
		LOGGER.debug("Query : " + qr.toString());
		return mongoTemplate.findOne(qr, Resume.class);
	}
}
