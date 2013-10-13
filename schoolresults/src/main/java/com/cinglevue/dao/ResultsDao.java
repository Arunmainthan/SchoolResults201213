package com.cinglevue.dao;

import java.util.List;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;

/**
 * @author Arun Dao Interface for Displaying Results
 */
public interface ResultsDao {

	/**
	 * @param filterBySubject
	 *            - subject to filter
	 * @return the list of Result objects filtered by subject
	 */
	List<Result> getAllResults(String filterBySubject);

	/**
	 * @return the distinct subjects list
	 */
	List<Subject> getAllSubjects();

	/**
	 * @param result
	 *            - result to be saved
	 */
	void persistResult(Result result);

}
