package com.cinglevue.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;

/**
 * @author Arun 
 * Dao Implementation for Displaying Results The bean of this class should inject the
 * SessionFactory property as the HibernateDaoSupport needs that
 */
public class ResultsDaoImpl extends HibernateDaoSupport implements ResultsDao {

  /**
   * @param filterBySubject - subject to filter
   * @return the list of Result objects filtered by subject
   */
  public List<Result> getAllResults(String filterBySubject) {
    // TODO Auto-generated method stub
    List<Result> results = null;
    
    // Retrieve all the records if the filter is null
    if (filterBySubject == null) {
      results = getHibernateTemplate().find("from Result");
      return results;
    } else {
      // Retrieve the results filtered by the subject
      String query =
          String.format("from Result r where r.subject.subjectName='%s'", filterBySubject);
      results = getHibernateTemplate().find(query);
    }
    return results;
  }

  /**
   * @return the distinct subjects list
   */
  public List<Subject> getAllSubjects() {
    // TODO Auto-generated method stub
    return getHibernateTemplate().find("from Subject");
  }

}
