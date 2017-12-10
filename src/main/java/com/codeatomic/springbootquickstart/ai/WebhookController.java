package com.codeatomic.springbootquickstart.ai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codeatomic.springbootquickstart.topic.Address;
import com.codeatomic.springbootquickstart.topic.Customer;
import com.codeatomic.springbootquickstart.topic.CustomerRepository;


@RestController
public class WebhookController {

    
    @Autowired
    CustomerRepository customerRepository;
    
    @RequestMapping(method=RequestMethod.POST, value="/webhook/customers")
	public ResponseEntity<AICustomResponse> addCustomer(@RequestBody AICustomRequest  aiRequest) {
    	
    		System.out.println("inside webhook controller: "+aiRequest.getSessionId());
    		List<Customer> customer = new ArrayList<>();
    		if (aiRequest.getResult().getStringParameter("id")!=null && !aiRequest.getResult().getStringParameter("id").isEmpty()) {
    			customer = (List<Customer>) customerRepository.findById(Long.valueOf(aiRequest.getResult().getStringParameter("id", "1")));
			} else {
				customer = (List<Customer>) customerRepository.findByfirstName(aiRequest.getResult().getStringParameter("given-name", "anurag"));
			}
    		
    		System.out.println(customer.get(0).toString());
    		AICustomResponse resonse = new AICustomResponse();
    		resonse.setDisplayText(customer.get(0).toString());
    		resonse.setData(new Customer("Anurag", "andey", new Address()));
    		resonse.setLang("en");
    		resonse.setSpeech(customer.get(0).toString());
    		resonse.setId("1234");
    		resonse.setSessionId("123456");
    		resonse.setSource("rest");
    		
		return new ResponseEntity<>(resonse,HttpStatus.OK);
	}
    
	}
