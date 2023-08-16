package com.home.studentinfoservice.model;

import org.springframework.data.couchbase.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Student {

	private int id;
	private String name;
	private int addressId;
	
}
