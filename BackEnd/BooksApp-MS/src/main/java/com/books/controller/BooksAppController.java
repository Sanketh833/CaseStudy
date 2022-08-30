package com.books.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.entity.BooksEntity;
import com.books.service.BooksServiceInterface;

@RestController
@RequestMapping("/user")
public class BooksAppController {

	@Autowired
	BooksServiceInterface booksServiceInterface;

	@PostMapping("/books")
	public Integer createBook(@RequestBody BooksEntity booksEntity) {

		return booksServiceInterface.createBook(booksEntity);

	}

	@GetMapping("/getbook/{id}")
	public Optional<BooksEntity> getbookbyid(@PathVariable("id") Integer id) {

		Optional<BooksEntity> booksEntity = booksServiceInterface.getbookbyid(id);
		return booksEntity;

	}

	@GetMapping("/getallbooks")

	List<BooksEntity> getallbooks() {
		
		List<BooksEntity> booksEntities = booksServiceInterface.getallbooks();
		return booksEntities;

	}
	


}
