package com.codeatomic.springbootquickstart.ai;

import ai.api.model.AIRequest;
import ai.api.model.Result;

public class AICustomRequest extends AIRequest{
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
