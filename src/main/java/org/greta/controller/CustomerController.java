package org.greta.controller;

import java.util.List;

import org.greta.entites.Customer;
import org.greta.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
 private CustomerRepository customerRepository;
 
 
 @PostMapping("/savecustomer")
 public int saveCustomer(@RequestBody List<Customer> customers) {
	  
	     customerRepository.save(customers);
	     return customers.size();
	 
 }
 
 @GetMapping("/findAll")
 public Iterable<Customer> findAllCustomers(){
	 return customerRepository.findAll();
 }
 
 @GetMapping("/findByFistName/{firstName}")
 public List<Customer> findByFirstName(@PathVariable String firstName){
	 return customerRepository.findByFirstName(firstName);
 }
 
 

}
