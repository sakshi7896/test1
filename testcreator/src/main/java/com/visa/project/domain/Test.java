package com.visa.project.domain;

import javax.persistence.*;

@Entity
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int testId;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.LAZY)
	@JoinColumn(name="creatorEmailId")
	TestCreator testCreator;
	String titleOfTest;
	String description;
	String testLink;
	
	public Test(){
		
	}
	
	public Test(String titleOfTest, String description){
		super();
		this.titleOfTest = titleOfTest;
		this.description = description;	
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public TestCreator getTestCreator() {
		return testCreator;
	}

	public void settestCreator(TestCreator testCreator) {
		this.testCreator = testCreator;
	}

	public String getTitleOfTest() {
		return titleOfTest;
	}

	public void setTitleOfTest(String titleOfTest) {
		this.titleOfTest = titleOfTest;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
