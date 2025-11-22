package edu.icet.service;

import edu.icet.model.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    List<Customer> customers=new ArrayList<>();


    public List<Customer> getAll() {

        customers.add(new Customer("c001","Shashith","gampaha"));
        customers.add(new Customer("c002","Sithum","makola"));
        customers.add(new Customer("c003","Rumeshi","kadawatha"));
        customers.add(new Customer("c004","Rashini","colombo"));

        return customers;

    }

}
