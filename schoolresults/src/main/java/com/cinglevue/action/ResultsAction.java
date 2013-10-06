package com.cinglevue.action;

import java.util.List;

import org.springframework.core.io.Resource;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;
import com.cinglevue.service.ResultsService;

public class ResultsAction {

  // Results to pass to JSPs
  List<Result> results;
  List<Subject> uniqueSubjects;
  private Resource jsonFile;
  private String sortBy;

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

  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public Resource getJsonFile() {
    return jsonFile;
  }

  public void setJsonFile(Resource jsonFile) {
    this.jsonFile = jsonFile;
  }

  public String displayResults() throws Exception {

    results = resultsService.getAllResults();
    if (this.sortBy == null) {
      uniqueSubjects = resultsService.getAllSubjects();

    }

    return "DataLoaded";

  }

}
