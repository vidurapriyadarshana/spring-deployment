package org.example.springdeployments.service;

import org.example.springdeployments.entity.Customer;
import org.example.springdeployments.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }
    public void delete(Customer customer) {
        customerRepo.delete(customer);
    }
    public Customer update(Customer customer) {
        return customerRepo.save(customer);
    }
}
