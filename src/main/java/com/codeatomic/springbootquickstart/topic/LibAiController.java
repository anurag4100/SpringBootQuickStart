package com.codeatomic.springbootquickstart.topic;

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
	public ResponseEntity<AIResponse> addCustomer(@RequestBody AIResponse  aiRequest) {
    	AIResponse resonse = new AIResponse();
    	try {
    		System.out.println("inside webhook controller: ");
    		System.out.println("check :"+aiRequest.getResult().getResolvedQuery());
    		
		} catch (Exception e) {
			return new ResponseEntity<>(resonse,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(resonse,HttpStatus.ACCEPTED);
	}
    
	}
