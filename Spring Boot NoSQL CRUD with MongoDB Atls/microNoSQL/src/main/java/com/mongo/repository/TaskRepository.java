package com.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongo.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String>
{

	public List<Task> findBySeverity(Integer severity);

	@Query("{assignee : ?0}")
	public List<Task> geTasksByAssignee(String assignee);
}
