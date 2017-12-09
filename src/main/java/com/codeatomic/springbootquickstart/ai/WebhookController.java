package com.codeatomic.springbootquickstart.ai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebhookController {

    
    @RequestMapping(method=RequestMethod.POST, value="/webhook/customers")
	public ResponseEntity<AICustomResponse> addCustomer(@RequestBody AICustomRequest  aiRequest) {
    	AICustomResponse resonse = new AICustomResponse();
    	try {
    		System.out.println("inside webhook controller: "+aiRequest.getResult().getResolvedQuery());
		} catch (Exception e) {
			return new ResponseEntity<>(resonse,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(resonse,HttpStatus.ACCEPTED);
	}
    
	}