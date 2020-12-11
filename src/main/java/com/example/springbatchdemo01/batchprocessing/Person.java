package com.example.springbatchdemo01.batchprocessing;

import lombok.Data;

/**
 * @author leejalen
 */
@Data
public class Person {

	private String lastName;
	private String firstName;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
