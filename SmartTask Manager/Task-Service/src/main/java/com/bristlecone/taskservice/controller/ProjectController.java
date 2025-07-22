package com.bristlecone.taskservice.controller;

import com.bristlecone.taskservice.dto.ProjectDto;
import com.bristlecone.taskservice.service.ProjectService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto){

        ProjectDto createdProject = projectService.createProject(projectDto);

        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }
}
