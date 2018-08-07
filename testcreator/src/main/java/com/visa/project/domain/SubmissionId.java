package com.visa.project.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SubmissionId {
	
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.LAZY)
	@JoinColumn(name="testId")
	Test test;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.LAZY)
	@JoinColumn(name="questionId")
	Question question;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.LAZY)
	@JoinColumn(name="candidateId")
	Candidate candidate;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.LAZY)
	@JoinColumn(name="optionId")
	Option option;
	
	public SubmissionId(){
		
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}
	
	

}
