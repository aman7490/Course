package com.home.course.repository;

import org.springframework.data.repository.CrudRepository;

import com.home.course.entity.Course;

public interface MyRepository extends CrudRepository<Course, Integer> {
	
}
