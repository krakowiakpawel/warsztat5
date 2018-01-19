package pl.coderslab.warsztat5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.warsztat5.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {
	@GetMapping("/test")
	public String test() {
		return "{test:ok}";

	}

	@GetMapping("/jackson")
	public Book helloBook() {
		return new Book(1L, "ISBN", "titleee", "authoraa", "publisherr", "typee");
	}
}