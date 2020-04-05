package com.home.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author amandeep.singh
 *
 *@SpringBootApplication is a combination of three annotations 
 *@Configuration (used for Java-based configuration), 
 *@ComponentScan (used for component scanning), and 
 *@EnableAutoConfiguration (used to enable auto-configuration in Spring Boot)
 */
@SpringBootApplication
@EnableSwagger2
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
