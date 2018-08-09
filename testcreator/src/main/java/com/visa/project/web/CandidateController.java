package com.visa.project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.visa.project.domain.Candidate;
import com.visa.project.domain.TestCreator;
import com.visa.project.service.CandidateService;
import com.visa.project.service.CreatorService;

@Controller
public class CandidateController {
	@Autowired
	CandidateService service;

	// @RequestMapping(value="/creatorlogin",method = RequestMethod.POST)
	// public String login(@RequestParam("name")String
	// name,@RequestParam("email")String email,
	// @RequestParam("mobilenumber")Integer mobileNumber,
	// @RequestParam("organization")String Organization){
	// TestCreator tc = service.findOne(emailId);
	// if(tc!=null)
	// {
	// if(tc.getPassword().equals(password))
	// return "loginsuccess";
	// else
	// return "loginfailed";
	// }
	// else
	// return "loginfailed";
	// }

	@RequestMapping(value = "/candidatecontroller", method = RequestMethod.POST)
	public String signup(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("mobilenumber") Long mobileNumber, @RequestParam("organization") String Organization) {
		Candidate c = new Candidate(email, name, Organization, mobileNumber, 1);
		Candidate aux = service.addNew(c);
		if (aux != null)
			return "registrationsuccess";
		else
			return "registrationfailed";
	}

}