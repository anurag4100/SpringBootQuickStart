package com.codeatomic.springbootquickstart.ai;

import com.codeatomic.springbootquickstart.topic.Customer;

import ai.api.model.AIResponse;

public class AICustomResponse extends AIResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String speech;
	private String displayText;
	private Customer data;
	private String source;
	private FollowupEvent followupEvent;
	
	public String getSpeech() {
		return speech;
	}
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	public Customer getData() {
		return data;
	}
	public void setData(Customer data) {
		this.data = data;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public FollowupEvent getFollowupEvent() {
		return followupEvent;
	}
	public void setFollowupEvent(FollowupEvent followupEvent) {
		this.followupEvent = followupEvent;
	}
	
	

}
