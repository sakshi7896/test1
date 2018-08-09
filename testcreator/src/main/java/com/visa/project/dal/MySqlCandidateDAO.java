package com.visa.project.dal;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visa.project.domain.Candidate;
import com.visa.project.domain.TestCreator;

@Component("MySqlCandidateDAO")
public class MySqlCandidateDAO implements CandidateDAO{

	@Autowired
	EntityManager em;
	
	public Candidate findOne(int Id){
		
		Candidate c = em.find(Candidate.class, Id);
		return c;
		
	}
	
	public Candidate addNew(Candidate c){
		//Test dummy = setdummyTest();
		//c.setTest(dummy);
		em.persist(c);
		return c;
	}
	

	

}
