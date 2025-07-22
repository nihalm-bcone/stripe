package com.bristlecone.taskservice.repository;

import com.bristlecone.taskservice.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
