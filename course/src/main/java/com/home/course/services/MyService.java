package com.home.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.course.dao.DAO;
import com.home.course.entity.Course;
@Service
public class MyService {

	@Autowired
	DAO dao;
	
	public Course gotodaoforsave(Course course) {
		
		return dao.savedata(course);
	}

	public List<Course> getall() {
		// TODO Auto-generated method stub
		return dao.getalldata();
	}

	public Course updatefromid(Course course, int id) {
		// TODO Auto-generated method stub
		List<Course> course1 = dao.getalldata();
		for (int i = 0; i < course1.size(); i++) {
			if(course1.get(i).getId()==id) {
				course1.get(i).setId(id);
				course1.get(i).setCoursename(course.getCoursename());
				course1.get(i).setDuration(course.getDuration());
				course1.get(i).setFees(course.getFees());
				course1.get(i).setCourseDescription(course.getCourseDescription());
			return dao.updatefromid(course1.get(i));
			}
		}
		 return null;
	}

	public String deleterecord(Course course, int id) {
		// TODO Auto-generated method stub
		List<Course> course1 = dao.getalldata();
		if(!course1.isEmpty()) {
		for (int i = 0; i < course1.size(); i++) {
			if(course1.get(i).getId()==id) {
				course1.get(i).setId(id);
				course1.get(i).setCoursename(course.getCoursename());
				course1.get(i).setDuration(course.getDuration());
				course1.get(i).setFees(course.getFees());
				course1.get(i).setCourseDescription(course.getCourseDescription());
			 dao.delete_record(course1.get(i));
			 return "{  \"results\" : \"Record deleted successfully !!\" }"; 
			}
			
			else {
				return "{  \"results\" : \"Record not found !!\" }"; 
			}
		}
		}
		
		return "{  \"results\" : \"Zero record in database !!\" }"; 
	}

}
