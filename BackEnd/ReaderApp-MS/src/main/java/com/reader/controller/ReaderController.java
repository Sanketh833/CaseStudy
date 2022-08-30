package com.reader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reader.dto.ReaderDTO;
import com.reader.entity.Books;
import com.reader.service.ReaderService;

@RestController
@RequestMapping("/reader")
public class ReaderController {

	@Autowired
	ReaderService readerService;
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/rid")
	public ReaderDTO searchbooks(@PathVariable("rid") Integer rid) {

		restTemplate.getForObject("http://localhost:8083/allBooks", null)
		return readerService.searchBooks(rid);

	}

	@PostMapping("/buy")
	public ReaderDTO buythebook(@RequestBody ReaderDTO readerDTO) {
		return readerService.buythebook(readerDTO);

	}

	@GetMapping("/getallbooks")
	public List<ReaderDTO> findallbooks() {

//		List<ReaderDTO> readerDTO = readerService.findallbooks();
//		return readerDTO;
		
		
		List<Books> books = restTemplate.getForObject("http://localhost:8083/allBooks", List.class);
		
		System.out.println(books);
		
		return null;

	}

}
