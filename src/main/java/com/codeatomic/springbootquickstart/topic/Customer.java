package com.codeatomic.springbootquickstart.topic;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @JsonProperty
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private Address address;
    
    protected Customer() {}

	public Customer(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
    public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}



	@Override
    public String toString() {
        return String.format(
                "Customer ID is %d. Hi first name is %s and last name is %s. His date o birth is %s."
                + "He stays at %s , %s ,%s.",
                id, firstName, lastName,dob,address.getLine1(),address.getLine2(),address.getZipCode());
    }

}