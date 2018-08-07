package com.visa.project.domain;

import javax.persistence.*;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int questionId;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.LAZY)
	@JoinColumn(name="testId")
	Test test;
	String questionText;
	int questionMarks;
	int flagForMultipleChoice;
	
	public Question(){
		
	}
	
	public Question(String questionText, int questionMarks, int flagForMultipleChoice){
		super();
		this.questionText = questionText;
		this.questionMarks = questionMarks;
		this.flagForMultipleChoice = flagForMultipleChoice;
	}
	
	public int getQuestionId(){
		return questionId;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public int getQuestionMarks() {
		return questionMarks;
	}

	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}

	public int getFlagForMultipleChoice() {
		return flagForMultipleChoice;
	}

	public void setFlagForMultipleChoice(int flagForMultipleChoice) {
		this.flagForMultipleChoice = flagForMultipleChoice;
	}
	
	
	
}
