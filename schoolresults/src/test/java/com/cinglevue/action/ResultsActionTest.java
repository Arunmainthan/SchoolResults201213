package com.cinglevue.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cinglevue.domain.Result;
import com.cinglevue.domain.School;
import com.cinglevue.domain.Subject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/applicationContext-unit.xml"})
public class ResultsActionTest {

	@Autowired
	private ResultsAction resultsAction;
	
	@Test
	@Transactional
	public void test() throws Exception {
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		//resultsAction = (ResultsAction)context.getBean("resultsAction");
		School school = new School("school one");
		Subject subject = new Subject("subject one");
		Result result = new Result(school,subject,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0);
		resultsAction.persistResult(result);
		
		resultsAction.displayResults();
		assert(resultsAction.getResults().size()>0);
	}

}
