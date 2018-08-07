package com.visa.project.domain;

import javax.persistence.*;

@Entity
public class Option {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int optionId;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.LAZY)
	@JoinColumn(name="questionId")
	Question question;
	String optionText;
	int flagForCorrectOption;
	
	public Option(){
		
	}
	
	public Option(String optionText,int flagForCorrectOption){
		super();
		this.optionText = optionText;
		this.flagForCorrectOption = flagForCorrectOption;
	}
	
	public int getOptionId(){
		return optionId;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	public int getFlagForCorrectOption() {
		return flagForCorrectOption;
	}

	public void setFlagForCorrectOption(int flagForCorrectOption) {
		this.flagForCorrectOption = flagForCorrectOption;
	}
	
	
	
}
