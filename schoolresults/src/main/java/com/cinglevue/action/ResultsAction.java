package com.cinglevue.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;
import com.cinglevue.service.ResultsService;
import javax.servlet.http.HttpServletRequest;

public class ResultsAction {

  // Results to pass to JSPs
  private List<Result> results;
  private List<Subject> uniqueSubjects;
  private String filterBySubject;

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

    String filterBySubject = null;
    // HttpServletRequest request = ServletActionContext.getRequest();
    HttpServletRequest request = ServletActionContext.getRequest();
    if(request.getParameterMap().containsKey("filterBySubject")){
      filterBySubject = request.getParameter("filterBySubject");
    }
    results = resultsService.getAllResults(filterBySubject);
    uniqueSubjects = resultsService.getAllSubjects();
    return "DataLoaded";

  }

}
