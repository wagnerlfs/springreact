package com.schoolofnet.springreact.springreact.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolofnet.springreact.springreact.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	@Override
	default Optional<Task> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	@Override
	default List<Task> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
