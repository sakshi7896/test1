package com.visa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.visa.project.dal.CandidateDAO;
import com.visa.project.domain.Candidate;

@Component("candidateService")
@Transactional
public class CandidateService {
	
	@Autowired
	CandidateDAO dao;
	
	public Candidate findOne(int Id){
		return dao.findOne(Id);
	}
	

	public Candidate addNew(Candidate c){
		return dao.addNew(c);
	}

	
	
	

}