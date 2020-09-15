package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;
//mit den Aufruf http://localhost:8080/books bekommen wir den String auf dem Browser aus
	@GetMapping(value="/books")
	public String getAllBooks(){
		Book book = new Book();
		bookRepository.save(book);
		
		return "Books";
	}
}
