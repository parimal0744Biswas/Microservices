package com.mongo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.model.Task;
import com.mongo.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService
{
	@Autowired
	private TaskRepository tRepo;

	@Override
	public Task addTask(Task task)
	{
		task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
		return tRepo.save(task);
	}

	@Override
	public List<Task> findAllTasks()
	{
		return tRepo.findAll();
	}

	@Override
	public Task getTaskById(String taskId)
	{
		return tRepo.findById(taskId).get();
	}

	@Override
	public List<Task> getTaskBySeverity(Integer severity)
	{
		return tRepo.findBySeverity(severity);
	}

	@Override
	public List<Task> getTaskByAssignee(String assignee)
	{
		return tRepo.geTasksByAssignee(assignee);
	}

	@Override
	public Task updateTask(Task task)
	{
		Task existtask = tRepo.findById(task.getTaskId()).get();
		existtask.setAssignee(task.getAssignee());
		existtask.setDescription(task.getDescription());
		existtask.setSeverity(task.getSeverity());
		existtask.setStoryPoint(task.getStoryPoint());

		return tRepo.save(existtask);
	}

	@Override
	public String deleteTaskById(String taskId)
	{
		tRepo.deleteById(taskId);

		return "Deleted Succesfully" + taskId;
	}

}
