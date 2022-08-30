package com.reader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reader.entity.ReaderEntity;

public interface ReadRepository extends JpaRepository<ReaderEntity, Integer> {

}
