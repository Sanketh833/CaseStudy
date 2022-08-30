package com.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.entity.BooksEntity; 

@Service
public class BooksService implements BooksServiceInterface {

	@Autowired
	BooksRepository booksrepository;

	@Override
	public Integer createBook(BooksEntity booksEntity) {
		BooksEntity books = booksrepository.save(booksEntity);

		return books.getId();
	}

	@Override
	public Optional<BooksEntity> getbookbyid(Integer id) { 
		
		 return  booksrepository.findById(id);
	}

	@Override
	public List<BooksEntity> getallbooks() {

		return booksrepository.findAll();
	}
	
	 
	

}
