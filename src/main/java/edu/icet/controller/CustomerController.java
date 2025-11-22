package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService customerService;



    @GetMapping("/customerInfo")
    public List<Customer> getAll(){
        return customerService.getAll();

    }



}
