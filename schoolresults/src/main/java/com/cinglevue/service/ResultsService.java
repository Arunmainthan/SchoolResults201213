package com.cinglevue.service;

import java.util.List;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;

/**
 * @author Arun
 * Service Interface to talk to the DAO Layer
 */
public interface ResultsService {

  /**
   * @param filterBySubject - subject to filter
   * @return the list of Result objects filtered by subject
   */
  List<Result> getAllResults(String filterBySubject);

  /**
   * @return the distinct subjects list
   */
  List<Subject> getAllSubjects();

}
