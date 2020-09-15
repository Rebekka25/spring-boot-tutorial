package com.example.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;
//REST: Representational State Transfer
@RestController
public class BookController {
//mit den Aufruf http://localhost:8080/books bekommen wir den String auf dem Browser aus
	//GET gibt eine Resource zurück
	@GetMapping(value="/books")
	public String getAllBooks(){
		return "Books";
	}
	
}
