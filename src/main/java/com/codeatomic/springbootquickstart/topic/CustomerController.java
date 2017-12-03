package com.codeatomic.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    CustomerRepository customerRepository;
    
    @RequestMapping(value="/customers", method=RequestMethod.GET)
    public ResponseEntity<Object> allCustomers() {
    	List<Customer> list = new ArrayList<>();
    	
    	try {
    		list =(List<Customer>) customerRepository.findAll();	
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
    	return new ResponseEntity<>(list,HttpStatus.FOUND);
    }
    
    @RequestMapping("/customers/{id}")
    public ResponseEntity<Object> allCustomers(@PathVariable Long id) {
    	List<Customer> list = new ArrayList<>();
    	
    	try {
    		list =(List<Customer>) customerRepository.findById(id);	
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
    	return new ResponseEntity<>(list,HttpStatus.FOUND);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/customers")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer customer) {
    	try {
    		customerRepository.save(customer);	
		} catch (Exception e) {
			return new ResponseEntity<>(customer,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(customer,HttpStatus.ACCEPTED);
	}
    
	}
