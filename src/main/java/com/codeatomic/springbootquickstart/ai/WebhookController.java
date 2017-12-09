package com.codeatomic.springbootquickstart.ai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codeatomic.springbootquickstart.topic.Address;
import com.codeatomic.springbootquickstart.topic.Customer;

import ai.api.model.Fulfillment;


@RestController
public class WebhookController {

    
    @RequestMapping(method=RequestMethod.POST, value="/webhook/customers")
	public ResponseEntity<AICustomResponse> addCustomer(@RequestBody AICustomRequest  aiRequest) {
    	
    		System.out.println("inside webhook controller: "+aiRequest.getSessionId());
    		
    		AICustomResponse resonse = new AICustomResponse();
    		resonse.setDisplayText("abc");
    		resonse.setData(new Customer("Anurag", "andey", new Address()));
    		resonse.setLang("en");
    		resonse.setSpeech("Good Job.");
    		resonse.setId("1234");
    		resonse.setSessionId("123456");
    		resonse.setSource("rest");
		return new ResponseEntity<>(resonse,HttpStatus.OK);
	}
    
	}
