package com.reader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reader.dto.ReaderDTO;
import com.reader.entity.ReaderEntity;
import com.reader.repository.ReadRepository;

@Service
public class ReaderService {

	@Autowired
	ReadRepository readrepository;

	public ReaderDTO searchBooks(Integer rid) {

		ReaderEntity readerEntity = readrepository.getReferenceById(rid);

		ReaderDTO readerDTO = ReaderDTO.ReaderEntitytoDTOconversion();
		return readerDTO;

	}

	public ReaderDTO buythebook(ReaderDTO readerDTO) {

		ReaderEntity readerEntity = ReaderDTO.ReaderDTOtoEntityConversion(readerDTO);

		readrepository.save(readerEntity);
		return readerDTO;

	}

	public List<ReaderDTO> findallbooks() { 
		readrepository.findAll();
		return null;
		
	}

}
