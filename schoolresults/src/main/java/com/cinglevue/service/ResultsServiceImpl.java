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
    return resultsDao.getAllResults(filterBySubject);

  }

  /**
   * @return the distinct subjects list
   */
  public List<Subject> getAllSubjects() {
    // TODO Auto-generated method stub
    return resultsDao.getAllSubjects();
  }

}
