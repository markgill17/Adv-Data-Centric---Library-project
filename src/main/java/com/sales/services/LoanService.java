package com.sales.services;

import com.sales.models.Book;
import com.sales.models.Loan;
import com.sales.repositories.BookRepository;
import com.sales.repositories.LoanRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
	@Autowired
    LoanRepository lr;


    public ArrayList<Loan> getLoans(){
        return (ArrayList<Loan>) lr.findAll();
    }
    
    /*public Book addLoan(Loan loan) {
    	return lr.save(loan);
    }*/
}