package com.home.course.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increment
	private int id;
	private String coursename;
	private String duration;
	private double fees;
	private String courseDescription;
	
	public Course() {
	
	}


	public Course(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	
	public Course(int id, String coursename, String duration, double fees, String courseDescription) {
		this.id = id;
		this.coursename = coursename;
		this.duration = duration;
		this.fees = fees;
		this.courseDescription = courseDescription;
	}


	public Course(String coursename, String duration, double fees, String courseDescription) {
		this.coursename = coursename;
		this.duration = duration;
		this.fees = fees;
		this.courseDescription = courseDescription;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", duration=" + duration + ", fees=" + fees
				+ ", courseDescription=" + courseDescription + "]";
	}
	
	
	
}
