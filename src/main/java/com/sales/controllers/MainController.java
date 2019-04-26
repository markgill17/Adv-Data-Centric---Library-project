package com.sales.controllers;

import com.sales.models.Book;
import com.sales.models.Customer;
import com.sales.models.Loan;
import com.sales.services.BookService;
import com.sales.services.CustomerService;
import com.sales.services.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MainController
{
    @Autowired
    BookService bs;

    @RequestMapping(value = "/showBooks", method = RequestMethod.GET)
    public String getBooks(Model m)
    {
        ArrayList<Book> books = bs.getBooks();
        m.addAttribute("books", books);
        return "showBooks";
    }// getBooks

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String getBook(@ModelAttribute("bookAdd") Book b, HttpServletRequest h) {
     return "addBook";
    }//getbook
       
   @RequestMapping(value="/addBook", method = RequestMethod.POST)
   public String addBook(@Valid @ModelAttribute("bookAdd") Book newBook, BindingResult result,
     HttpServletRequest h, Model m) {
    
	 if (result.hasErrors()) {
		 return "addBook";
	 }
	 else {
		  bs.addBook(newBook);
		  
		  // re-populate the list
		  ArrayList<Book> books = bs.getBooks();
		
		  // add books to the model
		  m.addAttribute("books", books);
		
		  // return to show books page
		  return "showBooks";
	  }
    
    
   }//addbook*/
   
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   
   @Autowired
   CustomerService cs;

   @RequestMapping(value = "/showCustomers", method = RequestMethod.GET)
   public String getCustomers(Model m)
   {
       ArrayList<Customer> customers = cs.getCustomers();
       m.addAttribute("customers", customers);
       return "showCustomers";
   }// getCustomers
/*
   @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
   public String getCustomer(@ModelAttribute("customerAdd") Customer c, HttpServletRequest h) {
    return "addCustomer";
   }//getCustomer
      
  @RequestMapping(value="/addCustomer", method = RequestMethod.POST)
  public String addCustomer(@Valid @ModelAttribute("customerAdd") Customer newCustomer, BindingResult result,
    HttpServletRequest h, Model m) {
   
	 if (result.hasErrors()) {
		 return "addCustomer";
	 }
	 else {
		  cs.addCustomer(newCustomer);
		  
		  // re-populate the list
		  ArrayList<Customer> customers = cs.getCustomers();
		
		  // add books to the model
		  m.addAttribute("customers", customers);
		
		  // return to show books page
		  return "showCustomers";
	  }
   
   
  }//addCustomer*/
   
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  @Autowired
  LoanService ls;

  @RequestMapping(value = "/showLoans", method = RequestMethod.GET)
  public String getLoans(Model m)
  {
      ArrayList<Loan> loans = ls.getLoans();
      m.addAttribute("loans", loans);
      return "showLoans";
  }// getCustomers

  /*@RequestMapping(value = "/addLoan", method = RequestMethod.GET)
  public String getLoan(@ModelAttribute("loanAdd") Loan l, HttpServletRequest h) {
   return "addLoan";
  }//getCustomer
     
 @RequestMapping(value="/addLoan", method = RequestMethod.POST)
 public String addLoan(@Valid @ModelAttribute("loanAdd") Loan newLoan, BindingResult result,
   HttpServletRequest h, Model m) {
  
	 if (result.hasErrors()) {
		 return "addLoan";
	 }
	 else {
		  ls.addCustomer(newLoan);
		  
		  // re-populate the list
		  ArrayList<Loan> customers = ls.getLoans();
		
		  // add books to the model
		  m.addAttribute("loans", loans);
		
		  // return to show books page
		  return "showLoans";
	  }
  
  
 }//addCustomer*/

}// MainController
