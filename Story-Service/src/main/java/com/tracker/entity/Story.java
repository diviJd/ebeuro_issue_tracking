package com.tracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Story")
public class Story {

	@Id
	@Column(name = "ISSUE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer issueID;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CREATION_DATE")
	private String creationDate;

	@Column(name = "ASSIGNEE_ID")
	private Integer assigneeID;

	@Column(name = "STORY_POINT")
	private Integer storyPoint;
	
	private String status;

	public enum storyStatus {
		NEW, ESTIMATED, COMPLETED
	}

	public Story() {
		super();
	}

	public Story(Integer issueID, String title, String description, String creationDate, Integer assigneeID,
			Integer storyPoint) {
		super();
		this.issueID = issueID;
		this.title = title;
		this.description = description;
		this.creationDate = creationDate;
		this.assigneeID = assigneeID;
		this.storyPoint = storyPoint;
	}

	public Integer getIssueID() {
		return issueID;
	}

	public void setIssueID(Integer issueID) {
		this.issueID = issueID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getAssigneeID() {
		return assigneeID;
	}

	public void setAssigneeID(Integer assigneeID) {
		this.assigneeID = assigneeID;
	}

	public Integer getStoryPoint() {
		return storyPoint;
	}

	public void setStoryPoint(Integer storyPoint) {
		this.storyPoint = storyPoint;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
