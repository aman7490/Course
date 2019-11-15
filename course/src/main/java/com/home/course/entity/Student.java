package com.home.course.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Student")
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increment and for primary key 
	private long studentid;
	private String studentname;
	private Date joiningdate;
    private String enrolledCourse;
    
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public long getStudentid() {
		return studentid;
	}
	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", studentid=" + studentid + ", joiningdate=" + joiningdate
				+ ", enrolledCourse=" + enrolledCourse + "]";
	}
    
    
	



}
