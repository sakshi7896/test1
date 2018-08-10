package com.visa.project.dal;

import org.springframework.stereotype.Component;

import com.visa.project.domain.Candidate;
import com.visa.project.domain.TestCreator;

@Component("CandidateDAO")
public interface CandidateDAO {
	Candidate findOne(int candidateId);
	 
	 Candidate addNew(Candidate c);
}
