package com.bristlecone.taskservice.service;

import com.bristlecone.taskservice.dto.TaskDto;

public interface TaskService {

    public TaskDto createTask(TaskDto taskDto);
}
