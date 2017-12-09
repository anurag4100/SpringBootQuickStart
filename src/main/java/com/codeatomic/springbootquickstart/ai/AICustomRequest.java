package com.codeatomic.springbootquickstart.ai;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ai.api.model.AIRequest;
import ai.api.model.Result;

public class AICustomRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
}
