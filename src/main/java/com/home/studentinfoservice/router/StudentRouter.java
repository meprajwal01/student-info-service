package com.home.studentinfoservice.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.home.studentinfoservice.handler.StudentHandler;

@Configuration
public class StudentRouter {

	@Bean
	public RouterFunction<ServerResponse> saveStudent(StudentHandler studentHandler) {
		System.out.println("StudentRouter.saveStudent()");

		return RouterFunctions.route(RequestPredicates.POST("/save"), studentHandler::saveStudent);

	}

}
