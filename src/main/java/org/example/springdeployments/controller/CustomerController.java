package org.example.springdeployments.controller;

import org.example.springdeployments.entity.Customer;
import org.example.springdeployments.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    @PutMapping
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @DeleteMapping
    public void delete(@RequestBody Customer customer) {
        customerService.delete(customer);
    }
}
