package com.home.studentinfoservice.repo;

import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;

import com.home.studentinfoservice.model.Student;

public interface StudentRepo extends ReactiveCouchbaseRepository<Student, Integer>{

}
