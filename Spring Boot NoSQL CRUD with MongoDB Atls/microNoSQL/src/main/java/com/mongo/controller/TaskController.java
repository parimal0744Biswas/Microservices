package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.model.Task;
import com.mongo.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController
{

	@Autowired
	private TaskService tService;

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Task addTaskHandler(@RequestBody Task task)
	{
		return tService.addTask(task);
	}

	@PostMapping("/jio")
	public ResponseEntity<Task> addTaskHandlers(@RequestBody Task task)
	{
		Task task2 = tService.addTask(task);

		return new ResponseEntity<Task>(task2, HttpStatus.ACCEPTED);
	}

	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Task> findAllTasksHandler()
	{
		return tService.findAllTasks();
	}

}
