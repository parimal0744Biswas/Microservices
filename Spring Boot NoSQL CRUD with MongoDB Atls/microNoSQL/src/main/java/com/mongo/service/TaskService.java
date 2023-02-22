package com.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongo.model.Task;

@Service
public interface TaskService
{

	public Task addTask(Task task);

	public List<Task> findAllTasks();

	public Task getTaskById(String taskId);

	public List<Task> getTaskBySeverity(Integer severity);

	public List<Task> getTaskByAssignee(String assignee);

	public Task updateTask(Task task);

	public String deleteTaskById(String taskId);

}
