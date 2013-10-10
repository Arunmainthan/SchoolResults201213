package com.cinglevue.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/resources/applicationContext-unit.xml"})
public class ResultsActionTest {

	@Autowired
	private ResultsAction resultsAction;
	
	@Test
	public void test() throws Exception {
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		//resultsAction = (ResultsAction)context.getBean("resultsAction");
		resultsAction.displayResults();
	}

}
