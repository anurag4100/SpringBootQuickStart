package com.codeatomic.springbootquickstart.ai;

import com.google.gson.annotations.SerializedName;

public class AICustomRequest {
	/**
	 * 
	 */
	@SerializedName("sessionId")
	private String sessionId;
	
	@SerializedName("result")
	private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	
}
