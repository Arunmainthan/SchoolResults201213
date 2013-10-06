package com.cinglevue.service;

import java.util.List;

import com.cinglevue.dao.ResultsDao;
import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;

/**
 * @author Arun 
 * Implementation of the Service Interface to talk to the DAO Layer
 */
public class ResultsServiceImpl implements ResultsService {

  private ResultsDao resultsDao;

  /**
   * @return DAO Implementation
   */
  public ResultsDao getResultsDao() {
    return resultsDao;
  }

  /**
   * @param resultsDao - DAO implementation 
   */
  public void setResultsDao(ResultsDao resultsDao) {
    this.resultsDao = resultsDao;
  }

  /**
   * @param filterBySubject - subject to filter
   * @return the list of Result objects filtered by subject
   */
  public List<Result> getAllResults(String filterBySubject) {
    // TODO Auto-generated method stub
    String newFilterBySubject = null;
    
    // if the filter value is -1 , no value selected to filter,
    // In that case null will be passed , if its null DAO will query for all the results.
    // if its not either null or -1, the selected filter will be passed to DAO and
    // DAO will query for the filtered results
    if (filterBySubject != null && !filterBySubject.equals("-1")) {
      newFilterBySubject = filterBySubject;
    }
    return resultsDao.getAllResults(newFilterBySubject);

  }

  /**
   * @return the distinct subjects list
   */
  public List<Subject> getAllSubjects() {
    // TODO Auto-generated method stub
    return resultsDao.getAllSubjects();
  }

}
