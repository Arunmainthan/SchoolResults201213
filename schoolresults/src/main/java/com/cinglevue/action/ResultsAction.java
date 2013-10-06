package com.cinglevue.action;

import java.util.List;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;
import com.cinglevue.service.ResultsService;

/**
 * @author Arun 
 * Action class for displaying the School Results
 */
public class ResultsAction {

  // List of Results
  private List<Result> results;
  
  // List of Unique Subjects
  private List<Subject> uniqueSubjects;
  
  // Filter parameter - Results will be filtered by subject
  private String filterBySubject;
  
  // Reference of the Service Layer
  private ResultsService resultsService;

  /**
   * @return filterBySubject sent from View, accessible for View
   */
  public String getFilterBySubject() {
    return filterBySubject;
  }

  /**
   * @param filterBySubject - filterBySubject value to set
   */
  public void setFilterBySubject(String filterBySubject) {
    this.filterBySubject = filterBySubject;
  }

  /**
   * @return the distinct subjects list
   */
  public List<Subject> getUniqueSubjects() {
    return uniqueSubjects;
  }

  /**
   * @return List of Result objects
   */
  public List<Result> getResults() {
    return results;
  }

  /**
   * @param resultsService - Service class to be injected from Spring
   */
  public void setResultsService(ResultsService resultsService) {
    this.resultsService = resultsService;
  }

  /**
   * @return the result for the struts to proceed
   * @throws Exception
   */
  public String displayResults() throws Exception {

    //get the filtered results
    results = resultsService.getAllResults(filterBySubject);
    //get the distinct list of subjects
    uniqueSubjects = resultsService.getAllSubjects();
    return "DataLoaded";
  }
}
