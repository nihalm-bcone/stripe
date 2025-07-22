package com.bristlecone.taskservice.service.impl;

import com.bristlecone.taskservice.dto.ProjectDto;
import com.bristlecone.taskservice.entity.Project;
import com.bristlecone.taskservice.repository.ProjectRepository;
import com.bristlecone.taskservice.service.ProjectService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {

        Project project = modelMapper.map(projectDto, Project.class);
        Project savedProject = projectRepository.save(project);
        return modelMapper.map(savedProject, ProjectDto.class);

    }
}
