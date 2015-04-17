package com.julian.sabos.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.julian.sabos.resume.domain.Resume;
import com.julian.sabos.resume.repository.ResumeRepository;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
@SpringBootApplication
public class App implements CommandLineRunner {
	@Autowired
	private ResumeRepository resume;
	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * Method main.
	 * 
	 * @param args
	 *            String[]
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	/**
	 * Method run.
	 * 
	 * @param args
	 *            String[]
	 * 
	 * 
	 * @throws Exception
	 *             * @see org.springframework.boot.CommandLineRunner#run(String[])
	 */
	public void run(String... args) throws Exception {
		System.out.println("DB : " + this.mongoTemplate.getDb().getName());
		this.resume.deleteAll();

		this.resume.save(new Resume("Sabos", "Julian", "R&D Software Developper", "220 Impasse Ecole Maternelle 59590 RAISMES", "+33 6 87 84 94 68",
				"Super cool person", null, null, null, null, null));
		this.resume.save(new Resume("Bob", "Smith", "Software Developper", "230 Impasse Ecole Maternelle 59590 RAISMES", "+33 6 87 84 94 68",
				"Super cool person", null, null, null, null, null));

		System.out.println("Resumes found with findAll():");
		System.out.println("-------------------------------");
		for (Resume Resume : this.resume.findAll()) {
			System.out.println(Resume);
		}
		System.out.println();

		System.out.println("Resume found with findByFirstName('Julian'):");
		System.out.println("--------------------------------");
		System.out.println(this.resume.findByFirstName("Julian"));

		System.out.println("Resumes found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Resume Resume : this.resume.findByName("Bob")) {
			System.out.println(Resume);
		}
		Query qr = new Query();
		qr.addCriteria(Criteria.where("name").is("Sabos").and("firstName").is("Julian"));
		Resume tmpResume = this.mongoTemplate.findOne(qr, Resume.class);

		System.out.println("Here it is : " + tmpResume);
	}
}
