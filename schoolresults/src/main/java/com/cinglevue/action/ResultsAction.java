package com.cinglevue.action;

import java.util.List;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;
import com.cinglevue.service.ResultsService;

public class ResultsAction {

  // Results to pass to JSPs
  private List<Result> results;
  private List<Subject> uniqueSubjects;
  private String filterBySubject;

  public String getFilterBySubject() {
    return filterBySubject;
  }

  public void setFilterBySubject(String filterBySubject) {
    this.filterBySubject = filterBySubject;
  }

  public List<Subject> getUniqueSubjects() {
    return uniqueSubjects;
  }

  public void setUniqueSubjects(List<Subject> uniqueSubjects) {
    this.uniqueSubjects = uniqueSubjects;
  }

  public List<Result> getResults() {
    return results;
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }

  private ResultsService resultsService;

  public ResultsService getResultsService() {
    return resultsService;
  }

  public void setResultsService(ResultsService resultsService) {
    this.resultsService = resultsService;
  }

  public String displayResults() throws Exception {

//    String filterBySubject = null;
//    // HttpServletRequest request = ServletActionContext.getRequest();
//    HttpServletRequest request = ServletActionContext.getRequest();
//    if (request.getParameterMap().containsKey("filterBySubject")
//        && !request.getParameter("filterBySubject").equals("-1")) {
//      filterBySubject = request.getParameter("filterBySubject");
//      this.filterBySubject = filterBySubject;
//    }
    String newFilterBySubject = null;
    if(!this.filterBySubject.equals("-1")){
      newFilterBySubject = this.filterBySubject;
    }
    results = resultsService.getAllResults(newFilterBySubject);
    uniqueSubjects = resultsService.getAllSubjects();
    return "DataLoaded";

  }

}
