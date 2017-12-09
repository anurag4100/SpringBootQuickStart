package com.codeatomic.springbootquickstart.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ai.api.model.AIRequest;
import ai.api.model.AIResponse;
import ai.api.model.Result;

@RestController
public class LibAiController {

    
    @RequestMapping(method=RequestMethod.POST, value="/webhook/customers")
	public ResponseEntity<AIResponse> addCustomer(@RequestBody AIRequest  aiRequest) {
    	AIResponse resonse = new AIResponse();
    	try {
    		System.out.println("inside webhook controller: "+aiRequest.getOriginalRequest());
    		 
    	/*	"speech": "Barack Hussein Obama II was the 44th and current President of the United States.",
    	    "displayText": "Barack Hussein Obama II was the 44th and current President of the United States, and the first African American to hold the office. Born in Honolulu, Hawaii, Obama is a graduate of Columbia University   and Harvard Law School, where ",
    	    "data": {...},
    	    "contextOut": [...],
    	    "source": "DuckDuckGo"*/
    		Result result = new Result();
    		resonse.setResult(result);
    		
		} catch (Exception e) {
			return new ResponseEntity<>(resonse,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(resonse,HttpStatus.ACCEPTED);
	}
    
	}
