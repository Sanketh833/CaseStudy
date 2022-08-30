package com.books.service;

import java.util.List;
import java.util.Optional;

import com.books.entity.BooksEntity;

public interface BooksServiceInterface {

	Integer createBook(BooksEntity booksEntity);

	Optional<BooksEntity> getbookbyid(Integer id);

	List<BooksEntity> getallbooks();

	
}
