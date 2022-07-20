package com.schoolofnet.springreact.springreact.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolofnet.springreact.springreact.model.Task;
import com.schoolofnet.springreact.springreact.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	private TaskRepository taskRepository;
	
	public TaskController(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	@PostMapping
	public void save(@RequestBody Task task) {
		taskRepository.save(task);
	}
	
	@GetMapping
	public List<Task> findAll(){
		return taskRepository.findAll();
	}

	@DeleteMapping("/{id}" )
	public void delete(@PathVariable Long id){
		taskRepository.deleteById(id);
	}	
	
	
}
