package com.codeatomic.springbootquickstart.ai;

import com.codeatomic.springbootquickstart.topic.Customer;

public class FollowupEvent {

	private String name;
	private Customer data;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer getData() {
		return data;
	}
	public void setData(Customer data) {
		this.data = data;
	}
	
}
