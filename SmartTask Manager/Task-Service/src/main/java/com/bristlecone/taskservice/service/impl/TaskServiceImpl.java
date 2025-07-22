package com.bristlecone.taskservice.service.impl;

import com.bristlecone.taskservice.dto.TaskDto;
import com.bristlecone.taskservice.entity.Project;
import com.bristlecone.taskservice.entity.Task;
import com.bristlecone.taskservice.exception.ProjectNotFoundException;
import com.bristlecone.taskservice.exception.UserNotFoundException;
import com.bristlecone.taskservice.repository.ProjectRepository;
import com.bristlecone.taskservice.repository.TaskRepository;
import com.bristlecone.taskservice.service.TaskService;
import com.bristlecone.taskservice.service.UserClient;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private TaskRepository  taskRepository;
    private ModelMapper modelMapper;
    private ProjectRepository projectRepository;
    private JdbcTemplate jdbcTemplate;
    private UserClient userClient;

    @Override
    public TaskDto createTask(TaskDto taskDto) {

        if(!userClient.isUserExists(taskDto.getUserId())){
            throw new UserNotFoundException("User Not Found with Id: " + taskDto.getUserId());
        }

        Project project = projectRepository.findById(taskDto.getProjectId())
                .orElseThrow(() -> new ProjectNotFoundException("Project Not Found with Id: " + taskDto.getProjectId()));

        Task task = modelMapper.map(taskDto, Task.class);
        task.setProject(project);
        Task savedTask = taskRepository.save(task);
        jdbcTemplate.update("CALL auto_assign_priority(?)",savedTask.getId());
        Task updatedTask = taskRepository.findById(savedTask.getId()).get();

        return modelMapper.map(updatedTask, TaskDto.class);
    }
}
