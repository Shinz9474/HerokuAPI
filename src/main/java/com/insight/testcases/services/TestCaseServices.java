package com.insight.testcases.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.insight.pojoresources.CommonEntities;
import com.insight.pojoresources.TestCasePOJO;

public class TestCaseServices {

	public List<TestCasePOJO> getAllTestCasesServiceImpl()
	{
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();*/ 
		
		TestCasePOJO tc1 = new TestCasePOJO(1, "Smoke001", "Smoke001 test case");
		TestCasePOJO tc2 = new TestCasePOJO(2, "Smoke002", "Smoke002 test case");
		
		//dtf.format(now).toString(), dtf.format(now).toString(),
		List<TestCasePOJO> testcases = new ArrayList<>();
		testcases.add(tc1);
		testcases.add(tc2);
		return testcases;
	}
}
