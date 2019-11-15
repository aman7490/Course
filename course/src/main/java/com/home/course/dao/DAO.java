package com.home.course.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.course.entity.Course;
import com.home.course.entity.Student;
import com.home.course.repository.MyRepository;
import com.home.course.repository.MyStudRepository;
@Service
public class DAO {

	@Autowired
	MyRepository myRepository;
	
	@Autowired
	MyStudRepository myStudRepository;
	
	public Course savedata(Course course) {
		return myRepository.save(course);
		
	}

	public List<Course> getalldata() {
		// TODO Auto-generated method stub
		return (List<Course>) myRepository.findAll();
	}

	public Course updatefromid(Course course) {
		// TODO Auto-generated method stub
		return myRepository.save(course);
		
	}

	public void delete_record(Course course) {
		// TODO Auto-generated method stub
		myRepository.delete(course);;
	}

	

	public Student savestudrecord(Student student) {
		// TODO Auto-generated method stub
		return myStudRepository.save(student);
	}
	
	
	
}
