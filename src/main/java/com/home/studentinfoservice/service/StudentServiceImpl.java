package com.home.studentinfoservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.home.studentinfoservice.exception.InvalidStudentException;
import com.home.studentinfoservice.exception.StudentNotFoundException;
import com.home.studentinfoservice.model.Student;
import com.home.studentinfoservice.repo.StudentRepo;

import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private WebClient webClient;

	public Mono<Student> saveStudent(Student student) {

		System.out.println("StudentServiceImpl.saveStudent()");
		if (student.getName() == null || student.getName() == "") {
			// throw new InvalidStudentException("Invalid Student Exception 123");
			throw new StudentNotFoundException("Student Not Found");
		}

		return studentRepo.save(student);
	}

}
