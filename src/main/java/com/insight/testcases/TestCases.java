package com.insight.testcases;

//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.insight.pojoresources.CommonEntities;
import com.insight.pojoresources.TestCasePOJO;
import com.insight.testcases.services.TestCaseServices;

@Path("testcases")
public class TestCases {

	TestCaseServices tcservice = new TestCaseServices();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<TestCasePOJO> getAllTestCases()
	{			
		return tcservice.getAllTestCasesServiceImpl();
	}
}
