package com.sales.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Book;
import com.sales.repositories.BookRepository;

import java.util.ArrayList;

@Service
public class BookService {
    @Autowired
    BookRepository br;


    public ArrayList<Book> getBooks(){
        return (ArrayList<Book>) br.findAll();
    }
    
    public Book addBook(Book book) {
    	return br.save(book);
    }
}