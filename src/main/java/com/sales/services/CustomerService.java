package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Book;
import com.sales.models.Customer;
import com.sales.repositories.BookRepository;
import com.sales.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository cr;


    public ArrayList<Customer> getCustomers(){
        return (ArrayList<Customer>) cr.findAll();
    }
    
    /*public Book addCustomer(Customer customer) {
    	return cr.save(customer);
    }*/
}
