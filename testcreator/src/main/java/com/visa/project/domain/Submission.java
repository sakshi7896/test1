package com.visa.project.domain;

import javax.persistence.*;

@Entity
public class Submission {

	@EmbeddedId
	SubmissionId submissionId;

	public SubmissionId getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(SubmissionId submissionId) {
		this.submissionId = submissionId;
	}
	
	
	
}
