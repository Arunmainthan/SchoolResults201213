package com.cinglevue.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.Subject;

public class ResultsDaoImpl extends HibernateDaoSupport implements ResultsDao {

  public List<Result> getAllResults(String filterBySubject) {
    // TODO Auto-generated method stub
    List<Result> results = null;
    if (filterBySubject == null) {
      results = getHibernateTemplate().find("from Result");
      return results;
    } else {
      // results = getHibernateTemplate().find("from Result");
      String query = String.format("from Result r where r.subject.subjectName='%s'",filterBySubject);
      results = getHibernateTemplate().find(query);
    }

    return results;
  }

  public List<Subject> getAllSubjects() {
    // TODO Auto-generated method stub
    return getHibernateTemplate().find("from Subject");
  }

}
