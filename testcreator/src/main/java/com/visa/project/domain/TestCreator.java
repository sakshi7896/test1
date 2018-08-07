package com.visa.project.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestCreator {

	@Id
	String creatorEmailId;
	String name;
	String password;
	
	public TestCreator(){
		
	}
	
	public TestCreator(String creatorEmailId,String name, String password){
		super();
		this.creatorEmailId = creatorEmailId;
		this.name = name;
		this.password = password;
	}

	public String getCreatorEmailId() {
		return creatorEmailId;
	}

	public void setCreatorEmailId(String creatorEmailId) {
		this.creatorEmailId = creatorEmailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
