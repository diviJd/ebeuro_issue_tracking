package com.tracker.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bug")
public class Bug {
	
	@OneToOne
    @JoinColumn(name = "ISSUE_ID")
	private Integer issueID;
	
	public enum bugPriority{
		CRITICAL,
		MAJOR,
		MINOR
	}
	
	public enum bugStatus{
		NEW,
		VERIFIED,
		RESOLVED
	}
	
	public Integer getIssueID() {
		return issueID;
	}
	

}
