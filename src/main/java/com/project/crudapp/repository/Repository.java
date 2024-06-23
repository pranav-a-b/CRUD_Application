package com.project.crudapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.crudapp.model.Tutorial;

public interface Repository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
}