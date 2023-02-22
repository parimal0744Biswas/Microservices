package com.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collation = "task")
@AllArgsConstructor
@NoArgsConstructor
public class Task
{

	@Id
	private String taskId;
	private String description;
	private Integer severity;

	private String assignee;
	private Integer storyPoint;

}
