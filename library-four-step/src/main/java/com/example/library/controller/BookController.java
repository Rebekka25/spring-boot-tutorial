package com.example.library.controller;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;


//@RestController
@Controller
public class BookController {
	@Autowired
	BookRepository bookRepository;
//mit den Aufruf http://localhost:8080/books bekommen wir den String auf dem Browser aus
	@GetMapping(value="/books")
	public String getAllBooks(Model model){
		Book book = new Book("Angular", "Ralf Schmid", "dfgsdfds", LocalDate.of(2012,12, 1));
		bookRepository.save(book);
		model.addAttribute("book", book);
		return "book_overview";
		
	}
	
	@PostMapping("/books")
	public String sumbitBook(@ModelAttribute("book") Book book) {
		return "book_description";
	}
	
	

}