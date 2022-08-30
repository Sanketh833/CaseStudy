package com.books.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.entity.BooksEntity;

public interface BooksRepository extends JpaRepository<BooksEntity, Integer>{

}
