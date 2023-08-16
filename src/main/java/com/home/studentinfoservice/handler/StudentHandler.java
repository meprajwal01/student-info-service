package com.home.studentinfoservice.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.home.studentinfoservice.model.Student;
import com.home.studentinfoservice.service.StudentServiceImpl;

import reactor.core.publisher.Mono;

@Component
public class StudentHandler {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	public Mono<ServerResponse> saveStudent(ServerRequest serverRequest) {

		System.out.println("StudentHandler.saveStudent()");

		Mono<Student> monoStudent = serverRequest.bodyToMono(Student.class);

		return monoStudent.flatMap(s -> studentServiceImpl.saveStudent(s))
				.flatMap(ss -> ServerResponse.ok().contentType(MediaType.APPLICATION_NDJSON).bodyValue(ss));

	}

}
