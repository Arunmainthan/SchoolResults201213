package com.cinglevue.dao;

import java.util.List;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;

public interface ResultsDao {
  
  List<Result> getAllResults(String filterBySubject);

  List<Subject> getAllSubjects();

}
