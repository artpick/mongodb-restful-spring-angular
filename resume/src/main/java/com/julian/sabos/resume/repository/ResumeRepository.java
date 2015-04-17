package com.julian.sabos.resume.repository;

import com.julian.sabos.resume.domain.Resume;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Julian
 * @version $Revision: 1.0 $
 */
public abstract interface ResumeRepository extends MongoRepository<Resume, String> {
	/**
	 * Custom methods to find a record from its first name.
	 * 
	 * @param paramString
	 *            String
	 * @return Resume
	 */
	public abstract Resume findByFirstName(String paramString);

	/**
	 * Custom methods to find a record from its name.
	 * 
	 * @param paramString
	 *            String
	 * @return List<Resume>
	 */
	public abstract List<Resume> findByName(String paramString);
}
