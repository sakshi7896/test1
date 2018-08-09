package com.visa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.visa.project.dal.QuestionDAO;
import com.visa.project.domain.Test;

@Controller
public class TestController {

	@Autowired
	QuestionDAO testdao;

	@RequestMapping(value= "/testcreation", method = RequestMethod.GET)
	public String testcreated(@RequestParam("testTitle")String testTitle,
			@RequestParam("testDescription")String testdescription, @RequestParam("testLink")String testLink )
	{
		
		Test t= new Test(testTitle, testdescription);
		t.setTestLink(testLink);
	testdao.addNewTest(t, testTitle, testdescription, testLink);
	return "edittest";
	}
}
