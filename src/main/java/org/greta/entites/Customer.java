package org.greta.entites;

import org.springframework.data.annotation.Id;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "offreemploi",type = "customer", shards = 2)
public class Customer {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
