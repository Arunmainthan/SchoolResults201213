package com.cinglevue.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;

/**
 * @author Arun Dao Implementation for Displaying Results The bean of this class
 *         should inject the SessionFactory property as the HibernateDaoSupport
 *         needs that
 */
public class ResultsDaoImpl implements ResultsDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * @param filterBySubject
	 *            - subject to filter
	 * @return the list of Result objects filtered by subject
	 */
	public List<Result> getAllResults(String filterBySubject) {
		// TODO Auto-generated method stub
		List<Result> results = null;

		// Retrieve all the records if the filter is null
		if (filterBySubject == null) {

			results = sessionFactory.getCurrentSession()
					.createQuery("from Result").list();
			return results;
		} else {
			// Retrieve the results filtered by the subject
			String query = String.format(
					"from Result r where r.subject.subjectName='%s'",
					filterBySubject);
			results = sessionFactory.getCurrentSession()
					.createQuery("from Result").list();
		}
		return results;
	}

	/**
	 * @return the distinct subjects list
	 */
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Subject")
				.list();
	}

	/**
	 * @param result
	 *            - result to be saved
	 */
	public void persistResult(Result result) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(result);
	}

}
