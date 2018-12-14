package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "studtab")
public class Student {
	@Id
	@Column(name = "Id")
	private int studId;
	@Column(name = "Name")
	private String studName;
	@Column(name = "Email")
	private String studEmail;
	@Column(name = "Branch")
	private String studBranch;
	@ElementCollection
	@CollectionTable(name = "course_tab", joinColumns = @JoinColumn(name = "studId"))
	@OrderColumn(name = "pos")
	@Column(name = "data")
	private List<String> course = new ArrayList();

	public Student() {
		super();
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudBranch() {
		return studBranch;
	}

	public void setStudBranch(String studBranch) {
		this.studBranch = studBranch;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studEmail=" + studEmail + ", studBranch="
				+ studBranch + ", course=" + course + "]";
	}

}
