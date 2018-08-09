package com.visa.project.dal;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.visa.project.domain.TestCreator;

public class MySqlCreatorDAO implements CreatorDAO{

	@Autowired
	EntityManager em;
	
	public TestCreator findOne(String creatorEmailId){
		
		TestCreator tc = em.find(TestCreator.class, creatorEmailId);
		return tc;
		
	}
	
	
}
