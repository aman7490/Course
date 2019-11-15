package com.home.course.repository;

import org.springframework.data.repository.CrudRepository;

import com.home.course.entity.Student;


public interface MyStudRepository extends CrudRepository<Student, Integer>{
	
}