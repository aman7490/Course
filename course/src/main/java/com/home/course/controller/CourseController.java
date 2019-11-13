package com.home.course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.course.entity.Course;
import com.home.course.repository.MyRepository;
import com.home.course.services.MyService;

/**
 * @author amandeep.singh
 *
 */
@RestController
public class CourseController {

	@Autowired
	MyService service;
	MyRepository repository;
	
	//@PostMapping(value="/save", method = RequestMethod.POST)
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public Course gotoserviceforsave(@RequestBody Course course) {
		return service.gotodaoforsave(course);
	}
	
	@RequestMapping (value="/get", method = RequestMethod.GET)
	public List<Course> gotoserviceforget(){
		
		List<Course> emptylist = new ArrayList<Course>();
		
		emptylist = service.getall();
		
		return emptylist;
		
	}
	
	
	@RequestMapping (value="/update/{id}", method = RequestMethod.PUT) 
	public Course gotoserviceforupdate(@RequestBody Course course, @PathVariable int id){
		
	//	Course toupdate = new Course(id);
	
		return service.updatefromid(course,id);
		
	}
	
	@RequestMapping (value="/delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String gotoservicefordelete(@RequestBody Course course, @PathVariable int id) {
		return service.deleterecord(course,id);
		//return "{  \"results\" : \"Record deleted successfully !!\" }"; 
	}
	
	
	
	
	
	
	
	
	
	
	
}
